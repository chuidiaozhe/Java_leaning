package com.company;


import java.util.Random;

public class TestA {
    public static void main(String args[]){
//        String a  = "3jrejkjdjfiiifdjkf33534543";
//        String regEx="[^0-9]";
//        Pattern p = Pattern.compile(regEx);
//        Matcher m = p.matcher(a);
//        System.out.println(m.replaceAll("").trim());
           Random random = new Random();
        for (int i = 0; i < 10 ; i++) {
            System.out.println(" ===== " + random.nextInt(3));
        }
    }
}
