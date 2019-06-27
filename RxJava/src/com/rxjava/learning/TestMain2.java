package com.rxjava.learning;

import com.sun.tools.corba.se.idl.constExpr.Times;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Func0;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * 主要用来测试Observables
 * */
public class TestMain2 {
    public static void main(String args[]){
//       createTest();
//        justTest();
//        fromTest();
//        deferTest();

//         intervalTest();
//        rangeTest();
        String fatieTimes[]=new String[]{
                "2018年9月17日 下午7:53"
        };

        String huiTie1Times[] = new String[]{
           "2018年9月17日 下午9:52"
        };

        String huiTie2Times[] = new String[]{

        };

         for (int i = 0; i < fatieTimes.length ; i++) {
            String faTieTime = fatieTimes[i];
            String huiTieTime = huiTie1Times[i];
            String tiems[] = huiTieTime.split("\n");
          for (String time : tiems){
             long shijianCha = getLongTime(time) - getLongTime(faTieTime);
             System.out.println(shijianCha/(1000*60));
         }
        }

    }

  static   SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 ahh:mm");
    public static long  getLongTime(String time){
        if(time == null || time.trim().equals("")){
            return  0L;
        }else{
            try {
                Date date = simpleDateFormat.parse(time.trim());
                return  date.getTime();
            } catch (ParseException e) {
                e.printStackTrace();
                return  0l;
            }
        }
    }

    /**
     * creat 方法创建Observable
     * */
    public static void createTest(){
        Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                 subscriber.onNext("测试Create ");
            }
        }).subscribe(new Subscriber<String>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onNext(String s) {
                  System.out.println("onNext : " +s);
            }
        });
    }
    /**
     * just方法创建observable
     * */
    public static void justTest(){
        Observable.just("Just Test").subscribe(new Subscriber<String>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onNext(String s) {
               System.out.println(" onNext : " + s);
            }
        });
    }

    /**
     * 通过from方法创建
     * */
    public static void fromTest(){
        Observable.from(new String[]{"ceshi1" ,"ceshi2","ceshi3"}).subscribe(new Subscriber<String>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onNext(String s) {
               System.out.println("onNext : " +s);
            }
        });
        String strs[] = {"111","222","3333"};
        Observable.from(Arrays.asList(strs)).subscribe(new Subscriber<String>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onNext(String s) {
              System.out.println("onNext : " +s );
            }
        });

    }

    private static String deferStr;
    public static void deferTest(){
      Observable observable =  Observable.defer(new Func0<Observable<String>>() {
            @Override
            public Observable<String> call() {
                return Observable.just(deferStr);
            }
        });
      deferStr = "延迟后再去加载";
      observable.subscribe(new Subscriber<String>( ) {
          @Override
          public void onCompleted() {

          }

          @Override
          public void onError(Throwable throwable) {

          }

          @Override
          public void onNext(String o) {
              System.out.printf(" onNext : " + o);
          }
      });
     }

     public static void emptyTest(){
      Observable emptyObservable =  Observable.empty();
      Observable neverObservable = Observable.never();
      Observable errorObservable =  Observable.error(new IllegalAccessException());
      emptyObservable.subscribe(new Subscriber() {
          @Override
          public void onCompleted() {

          }

          @Override
          public void onError(Throwable throwable) {

          }

          @Override
          public void onNext(Object o) {

          }
      });

     }

     /**
      * 一个定时器式的测试
      * */
     public static void intervalTest(){
         System.out.println(" start second: " + System.currentTimeMillis()/1000 );
       Observable observable  =  Observable.interval(1000, TimeUnit.SECONDS);
        observable.subscribe(new Subscriber<String>() {
           @Override
           public void onCompleted() {
               System.out.println(" onCompleted second  :  " + System.currentTimeMillis()/1000 );

           }

           @Override
           public void onError(Throwable throwable) {
               System.out.println(" onError second  :  " + System.currentTimeMillis()/1000 );

           }

           @Override
           public void onNext(String o) {
              System.out.println(" onNext second  :  " + System.currentTimeMillis()/1000 );
           }
       });
     }

     /**
      * 一个范围内的整数输出
      * */
     public static void rangeTest(){
       Observable observable =   Observable.range(1,5).repeat(3);
       observable.subscribe(new Subscriber<Integer>() {
           @Override
           public void onCompleted() {
              System.out.println(" onCompleted ");
           }

           @Override
           public void onError(Throwable throwable) {

           }

           @Override
           public void onNext(Integer sub) {
               System.out.println(" sub :  " + sub);

           }
       });
     }

}
