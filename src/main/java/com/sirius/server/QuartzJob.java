package com.sirius.server;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
public class QuartzJob implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) {
        JobDataMap jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap();
        MethodInvoke methodInvoke = (MethodInvoke) jobDataMap.get("methodInvoke");
        methodInvoke.invoke();
    }
}
