package com.sirius.server.quartz;

import com.sirius.server.ServerApplication;
import com.sirius.server.database.model.impl.NewsModel;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Day0ClockQuartz implements Job {

    private Logger logger = LoggerFactory.getLogger(Day0ClockQuartz.class);

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        NewsModel newsModel = ServerApplication.getApplicationContext().getBean(NewsModel.class);
        newsModel.deleteBefore();
    }
}
