package com.sirius.server.manager.impl;

import com.sirius.server.manager.IService;
import com.sirius.server.quartz.Day0ClockQuartz;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.stereotype.Service;

@Service
public class QuartzIService implements IService {
    @Override
    public void init() {
        try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            scheduler.start();
            createJob(scheduler, "Day0ClockQuartz", "0 0 0 * * ?", Day0ClockQuartz.class);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
        logger.info("QuartzIService init");
    }

    @Override
    public void destroy() {
        logger.info("QuartzIService destroy");
    }

    public void createJob(Scheduler scheduler, String jobName, String cronExpression, Class<? extends Job> classs) throws SchedulerException {
        JobKey jobKey = new JobKey(jobName, Scheduler.DEFAULT_GROUP);
        if (scheduler.getJobDetail(jobKey) != null) {
            scheduler.deleteJob(jobKey);
        }
        JobDetail job = JobBuilder.newJob(classs).withIdentity(jobKey).build();
        TriggerKey triggerKey = new TriggerKey(jobName + "Trigger", Scheduler.DEFAULT_GROUP);
        Trigger trigger = TriggerBuilder
                .newTrigger()
                .withIdentity(triggerKey)
                .startNow()
                .withSchedule(CronScheduleBuilder.cronSchedule(cronExpression))
                .build();
        scheduler.scheduleJob(job, trigger);
    }
}
