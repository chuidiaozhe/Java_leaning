package com.java.thread.threadpool;

import com.sun.org.glassfish.gmbal.Description;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @description 创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空线程
 *              ，若无可回收，则新建线程。
 * */
public class NewCachedThreadPoolTest {

    public static void main(String args[]){
        ExecutorService cacheThreadPool = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            final int index = i;
           MyThread thread = new MyThread();
           thread.setName("name"+index);
           cacheThreadPool.execute(thread);
         }

    }

    public static class MyThread extends Thread{
        @Override
        public void run() {
            super.run();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread name === "+getName());
        }
    }

}
