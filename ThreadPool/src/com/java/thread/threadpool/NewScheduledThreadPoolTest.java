package com.java.thread.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @description 创建一个定长的线程池，支持定时及周期性的执行任务
 * */
public class NewScheduledThreadPoolTest {
    public static void main(String args[]){
//       testSchedule();
         testFixedRate();
    }

    /**
     * 测试定长线程延迟执行
     * */
    public static void testSchedule(){
        System.out.println("添加线程start");
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        for (int i = 0; i < 10; i++) {

            NewCachedThreadPoolTest.MyThread thread = new NewCachedThreadPoolTest.MyThread();
            thread.setName("name"+i);
            scheduledExecutorService.schedule(thread,3, TimeUnit.SECONDS);
        }
        System.out.println("添加线程end");
    }
    /**
     * 测试线程定期执行
     * */
    public static void testFixedRate(){
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        System.out.println("添加线程start");
        for (int i = 0; i < 10 ; i++) {
            NewCachedThreadPoolTest.MyThread thread = new NewCachedThreadPoolTest.MyThread();
            thread.setName("name"+i);
            scheduledExecutorService.scheduleAtFixedRate(thread,3,5, TimeUnit.SECONDS);
        }
        System.out.println("添加线程end");
    }
}
