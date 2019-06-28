package com.sirius.server.quartz;

import com.sirius.server.ServerApplication;
import com.sirius.server.service.impl.NewsService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;

/**
 * @Date:2019/6/28 17:37
 * @Author:高连棣
 */
public class Day0ClockQuartz implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) {
        NewsService newsManager = ServerApplication.getApplicationContext().getBean(NewsService.class);
        newsManager.deleteBefore();
    }
}
