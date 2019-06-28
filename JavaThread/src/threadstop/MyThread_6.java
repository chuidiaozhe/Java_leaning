package threadstop;

public class MyThread_6 extends Thread {
    @Override
    public void run() {
        super.run();
        while (true){
            if(this.isInterrupted()){
                System.out.println("停止了");
                return;
            }
            System.out.println("timer = " + System.currentTimeMillis());
        }
    }
}


class main6{
    public static void main(String[] args){
        try {
            MyThread_6 thread = new MyThread_6();
            thread.start();
            Thread.sleep(2000);
             thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}