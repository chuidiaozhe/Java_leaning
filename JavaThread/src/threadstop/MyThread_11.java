package threadstop;

public class MyThread_11 extends Thread {
    private int i = 0;
    @Override
    public void run() {
        super.run();
        while (true){
            try {
                i++;
                System.out.println("i= "+(i));
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Main11{
    public static void main(String[] args){
        try {
            MyThread_11 thread = new MyThread_11();
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(5000);
            System.out.println("守护线程离开了！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}