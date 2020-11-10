package zhouyang;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Concurrent4 {

    public static void main(String args[]) {
        ProdConsmer prodConsmer = new ProdConsmer();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(400);
                    prodConsmer.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "A").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(300);
                    prodConsmer.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "B").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(200);
                    prodConsmer.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "C").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                    prodConsmer.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "D").start();
    }

}

//class ProdConsmer{
//   private int number = 0;
//
//    public synchronized void increment() throws InterruptedException {
//        while (number == 1){
//            wait();
//        }
//
//        number++;
//
//        System.out.println(Thread.currentThread().getName() + "\t" + number );
//        notifyAll();
//    }
//
//    public synchronized void decrement() throws InterruptedException {
//        while (number == 0){
//             wait();
//        }
//
//        number--;
//        System.out.println(Thread.currentThread().getName() + "\t" + number );
//        notifyAll();
//    }
//
//
//}

class ProdConsmer {
    private int number = 0;

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void increment() throws InterruptedException {

        lock.lock();

        try {

            while (number == 1) {
                condition.await();
            }

            number++;

            System.out.println(Thread.currentThread().getName() + "\t" + number);

            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }


    }

    public synchronized void decrement() throws InterruptedException {
        lock.lock();

        try {

            while (number == 0) {
                condition.await();
            }

            number--;
            System.out.println(Thread.currentThread().getName() + "\t" + number);
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }


}
