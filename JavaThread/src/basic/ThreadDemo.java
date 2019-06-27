package basic;

public class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;

    public ThreadDemo(String threadName) {
         this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0 ; i--) {
                System.out.println("Thread:" + threadName  + "    "+ i);
                //让线程睡眠一会
                Thread.sleep(100);
            }
        }catch (InterruptedException e){
            System.out.println("Thread " + threadName + " Interrupted");
        }
        System.out.println("Thread " + threadName + "  exiting.");    }


    public void start(){
        System.out.println("Starting " + threadName);
        if(t == null){
            t = new Thread(this,threadName);
            t.start();
         }
    }

}

class TestMain{
    public static void main(String agrgs[]){
        ThreadDemo thread1 = new ThreadDemo("thread1");
        thread1.start();

        ThreadDemo thread2 = new ThreadDemo("thread2");
        thread2.start();
    }
}
