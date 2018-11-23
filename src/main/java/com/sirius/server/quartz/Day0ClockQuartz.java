package com.sirius.server.quartz;

import com.sirius.server.database.model.NewsModel;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class Day0ClockQuartz implements Job {

    private Logger logger = LoggerFactory.getLogger(Day0ClockQuartz.class);

    @Autowired
    private NewsModel newsModel;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        newsModel.deleteBefore();
    }
}
