package threadstop;

public class MyThread_3 extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i <  50000; i++) {
                if(this.isInterrupted()){
                    System.out.println("已经是停止状态了，我要退出");
                    throw new InterruptedException();
                }
                System.out.println("i="+(i+1));
            }
            System.out.println("for下面");
        }catch (InterruptedException e){
            System.out.println("进MyThread类run方法中的catch");
            e.printStackTrace();
        }

    }
}

      class Main5{
         public static void main(String[] ags){
             try {
                 MyThread_3 thread = new MyThread_3();
                 thread.start();
                 Thread.sleep(200);
                 thread.interrupt();
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
            System.out.println("end");
         }
        }
