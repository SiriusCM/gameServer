package com.sirius.server.service.impl;

import com.sirius.server.MethodInvoke;
import com.sirius.server.event.Init;
import com.sirius.server.event.Schedule;
import com.sirius.server.service.IService;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
@Service
public class QuartzService implements IService {

    @Autowired
    private MethodService<Schedule> methodService;

    @Init(level = 9)
    public void init() {
        try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            scheduler.start();
            methodService.getMethods(Schedule.class).forEach(e -> {
                Schedule schedule = e.getAnnotation();
                createJob(scheduler, "QuartzJob" + e.hashCode(), schedule.value(), e);
            });
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

    private void createJob(Scheduler scheduler, String jobName, String cronExpression, MethodInvoke methodInvoke) {
        try {
            JobKey jobKey = new JobKey(jobName, Scheduler.DEFAULT_GROUP);
            if (scheduler.getJobDetail(jobKey) != null) {
                scheduler.deleteJob(jobKey);
            }
            JobDetail job = JobBuilder.newJob(QuartzJob.class).withIdentity(jobKey).build();
            job.getJobDataMap().put("methodInvoke", methodInvoke);
            TriggerKey triggerKey = new TriggerKey(jobName + System.currentTimeMillis(), Scheduler.DEFAULT_GROUP);
            Trigger trigger = TriggerBuilder
                    .newTrigger()
                    .withIdentity(triggerKey)
                    .startNow()
                    .withSchedule(CronScheduleBuilder.cronSchedule(cronExpression))
                    .build();
            scheduler.scheduleJob(job, trigger);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

    public static class QuartzJob implements Job {

        @Override
        public void execute(JobExecutionContext jobExecutionContext) {
            JobDataMap jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap();
            MethodInvoke methodInvoke = (MethodInvoke) jobDataMap.get("methodInvoke");
            methodInvoke.invoke();
        }
    }
}
