package com.company;

import java.io.Serializable;

public class Person implements Serializable{
     private  static long counters ;
     private final static long counterss = counters ++;
    public transient   String name;
    public int age;

    public Person() {
        System.out.println(" counterss ======== " + counterss);
    }
}
