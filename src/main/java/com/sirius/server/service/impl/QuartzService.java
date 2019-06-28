package com.sirius.server.service.impl;

import com.sirius.server.ServerApplication;
import com.sirius.server.annotation.Schedule;
import com.sirius.server.quartz.Day0ClockQuartz;
import com.sirius.server.service.IService;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
@Service
public class QuartzService implements IService {
    @Override
    public void init() {
        try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            scheduler.start();
            ServerApplication.getApplicationContext().getBeansOfType(Object.class).forEach((name, e) -> {
                for (Method method : e.getClass().getMethods()) {
                    if (method.isAnnotationPresent(Schedule.class)) {
                        try {
                            String value = method.getAnnotation(Schedule.class).value();
                            createJob(scheduler, "Day0ClockQuartz", value, Day0ClockQuartz.class);
                            method.invoke(e);
                        } catch (IllegalAccessException ex) {
                            ex.printStackTrace();
                        } catch (InvocationTargetException ex) {
                            ex.printStackTrace();
                        } catch (SchedulerException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            });
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void destroy() {
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
