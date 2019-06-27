package com;



public class Test {
    public static void main(String [] args){
        int a = 10;
        test1(a);
        System.out.println("a = " + a);

    }

    public static void test1(int a){
        int b = a;
        a = 20;
    }
}
