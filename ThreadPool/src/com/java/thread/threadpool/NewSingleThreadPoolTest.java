package com.java.thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有的任务都是
 *              按照指定(FIFO先进先出)顺序执行。
 * */
public class NewSingleThreadPoolTest {
    public static void  main(String args[]){
        ExecutorService singleThreadpool = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            NewCachedThreadPoolTest.MyThread thread = new NewCachedThreadPoolTest.MyThread();
            thread.setName("name"+i);
            singleThreadpool.execute(thread);
        }
    }
}
