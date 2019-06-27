package com.java.thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待
 * */
public class NewFixedThreadPoolTest {
    public static void main(String args[]){
        ExecutorService newFixedTreadPool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10 ; i++) {
            NewCachedThreadPoolTest.MyThread thread  = new NewCachedThreadPoolTest.MyThread();
            thread.setName("name"+i);
            newFixedTreadPool.execute(thread);
        }
    }
}
