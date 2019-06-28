package threadstop;

public class MyThread_4 extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run beigin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("在沉睡中被停止进入catch" + this.isInterrupted());
            e.printStackTrace();
        }
    }
}

class Main6{
    public static void main(String[] agrs){
        try {
            MyThread_4 thread = new MyThread_4();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
           System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");
    }
}