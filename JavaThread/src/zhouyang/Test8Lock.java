package zhouyang;

import java.util.concurrent.TimeUnit;

public class Test8Lock {

    public static void main(String[] args) throws InterruptedException {

        Phone phone = new Phone();
        Phone phone1 = new Phone();


        new Thread(() -> {
            try {
                phone.sendSMS();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "A").start();

        TimeUnit.MILLISECONDS.sleep(200);

        new Thread(() -> {
//            phone.sayHello();
            phone1.sendEMAIL();
        }, "B").start();

    }


}


class Phone {
    public synchronized static void sendSMS() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        System.out.println("********** sendSMS ********");
      }

    public static void sendEMAIL() {
        System.out.println("********** sendEMAIL ********");
    }

    public synchronized static void sayHello() {
        System.out.println("********** sayHello ********");
    }

}