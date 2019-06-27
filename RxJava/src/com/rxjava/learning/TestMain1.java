package com.rxjava.learning;

import javafx.beans.Observable;
import rx.Observer;
import rx.Subscriber;

public class TestMain1 {
    public static void main(String args[]){
        //第一步：创建被观察者
        rx.Observable observable  = rx.Observable.create(new rx.Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                   subscriber.onNext("hello word!");
//                   subscriber.onCompleted();
                   subscriber.onError(new NullPointerException());


            }
        });
        //第二步：创建观察者
        Subscriber subscriber = new Subscriber() {
            @Override
            public void onCompleted() {
                 System.out.println(" conCompleted()");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(" onError() : " + throwable.getMessage());
            }

            @Override
            public void onNext(Object o) {
                System.out.println("  onNext() :  " + (String) o) ;
            }
        };
        //订阅事件
        observable.subscribe(subscriber);
    }
}
