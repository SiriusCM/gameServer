package com.sirius.server;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
public class QuartzJob implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) {
        try {
            JobDataMap jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap();
            Object object = jobDataMap.get("object");
            Method method = (Method) jobDataMap.get("method");
            Object[] params = (Object[]) jobDataMap.get("params");
            method.invoke(object, params);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
