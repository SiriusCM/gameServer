package com.sirius.server.manager.impl;

import com.sirius.server.manager.Service;
import com.sirius.server.quartz.Day0ClockQuartz;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

@org.springframework.stereotype.Service
public class QuartzService implements Service {
    @Override
    public void init() {
        try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            scheduler.start();
            createJob(scheduler, "Day0ClockQuartz", "0 0 0 * * ?", Day0ClockQuartz.class);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
        logger.info("QuartzService init");
    }

    @Override
    public void destroy() {
        logger.info("QuartzService destroy");
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
