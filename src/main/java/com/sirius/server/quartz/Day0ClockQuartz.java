package com.sirius.server.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * create by gaoliandi on 2018/11/23
 **/
public class Day0ClockQuartz implements Job {
	
	private Logger logger = LoggerFactory.getLogger(Day0ClockQuartz.class);
	
	@Override
	public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
	}
}
