package threadstop;

/**
 * 参考文章 https://blog.csdn.net/qq_37438740/article/details/81556733
 * */

public class MyThread_1 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10000 ; i++) {
             System.out.println("i="+(i+1) );
        }
     }
}

     class TestDemo1{
    public  static   void main(String[] args){
        try {
            MyThread_1 thread = new MyThread_1();
            thread.start();
            Thread.sleep(200);
             thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
