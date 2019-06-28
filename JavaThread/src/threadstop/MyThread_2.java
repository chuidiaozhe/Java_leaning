package threadstop;

public class MyThread_2 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i <  10000; i++) {
            System.out.println("i="+ (i + 1));
        }
    }
}

// class Test2{
//    public static void main(String[] args){
//        try {
//            MyThread_2 thread = new MyThread_2();
//            thread.start();
//            Thread.sleep(2000);
//            thread.interrupt();
//            System.out.println("=====================");
//            System.out.println("是否停止1？=" + thread.isInterrupted());
//            System.out.println("是否停止2？=" + thread.isInterrupted());
//            System.out.println("end");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
// }

// class Test3{
//    public static void main(String[] agrs){
//        try {
//            MyThread_2 thread = new MyThread_2();
//            thread.start();
//            Thread.sleep(2000);
//            Thread.currentThread().interrupt();
//            System.out.println("=====================");
//            System.out.println("是否停止1？=" + Thread.interrupted());
//            System.out.println("是否停止2？=" + Thread.interrupted());
//            System.out.println("end");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//    }
// }

class Test4{
    public static void main(String[] agrs){
        try {
            MyThread_2 thread = new MyThread_2();
            thread.start();
            Thread.sleep(1);
            thread.interrupt();
            System.out.println("=====================");
            System.out.println("是否停止1？=" + thread.isInterrupted());
            System.out.println("是否停止2？=" + thread.isInterrupted());
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

