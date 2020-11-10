package zhouyang;


import java.util.concurrent.*;

/**
 * 线程池的基本使用
 * */
public class ThreadPool {

    public static void main(String[] args){
//        ExecutorService executorService = Executors.newSingleThreadExecutor(); // 线程池里面只有一个线程
//        ExecutorService executorService = Executors.newFixedThreadPool(5); // 线程池里面有固定数量的线程
//        ExecutorService executorService = Executors.newCachedThreadPool(); // 线程池里面的线程数量会随着任务的多少而自动扩容
          ExecutorService executorService = new ThreadPoolExecutor(
                  2, //线程池中的常驻核心线程数
                  5, //线程池中能够容纳同时执行的最大线程数，此值必须大于等于1
                  10, //多余的空闲线程的存活时间，当前线程池中线程数量超过corePoolSize时，当空闲时间达到keppAliveTime时，多余线程会被销毁直到只剩下corePoolSize个线程为止
                  TimeUnit.SECONDS, //keepAliveTime的单位
                  new LinkedBlockingQueue<>(3), //任务队列，被提交但尚未被执行的任务
                    Executors.defaultThreadFactory(), //表示生成线程池中工作线程的线程工厂，用于创建线程，一般默认的即可
                  new ThreadPoolExecutor.AbortPolicy() //拒绝策略，表示当队列满了，并且工作线程大于等于线程池的最大线程数（maximumPoolSize）时如何来拒绝请求执行的runnable的策略
                  /**
                   * 拒绝策略包括以下四种：
                   *  1.AbortPolicy(默认)：直接抛出RejectedExecutionException异常阻止系统正常运行
                   *  2.CallerRunsPolicy:"调用者运行"一种调节机制，该策略既不会抛弃任务，也不会抛出异常，而是将
                   *    某些任务回退到调用者，从而降低新任务的流量。
                   *  3.DiscardOldestPolicy:抛弃队列中等待最久的任务，然后把当前任务加入队列中尝试再次提交当前任务。
                   *  4.DiscardPolicy:该策略默默地丢弃无法处理的的任务，不予任何处理也不抛出异常。如果允许任务丢失，这是最好的一种策略。
                   * */
          );


        try {

            for (int i = 0; i < 8; i++){
                int finalI = i;
                executorService.execute(()->{
                    System.out.println(Thread.currentThread().getName() + " " + finalI);
//                    try {
//                        TimeUnit.SECONDS.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                });
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            executorService.shutdown(); // 释放线程池
        }

    }
}
