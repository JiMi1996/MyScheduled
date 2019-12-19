package com.scheduler;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


public class MyJob implements Job {
    private static Log log = LogFactory.getLog(MyJob.class);

    @Autowired
    private DemoServiceProxy demoServiceProxy;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        List list = demoServiceProxy.query();
        System.err.println("list=============================" + list);
    }
}