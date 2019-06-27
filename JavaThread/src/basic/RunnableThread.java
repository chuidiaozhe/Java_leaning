package basic;


public class RunnableThread implements Runnable {
    private Thread t;
    private String threadName;

    public RunnableThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating " + threadName);
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
        System.out.println("Thread " + threadName + "  exiting.");
    }

    public void start(){
        System.out.println("Starting " + threadName);
        if(t == null){
            t = new Thread(this,threadName);
            t.start();
        }
    }
}

class TestMain1{
    public static void main(String agrgs[]){
        RunnableThread thread1 = new RunnableThread("thread1");
        thread1.start();

        RunnableThread thread2 = new RunnableThread("thread2");
        thread2.start();
    }
}