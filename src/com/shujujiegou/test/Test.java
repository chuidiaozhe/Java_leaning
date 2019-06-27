package com.shujujiegou.test;

public class Test {
    public static void main(String args[]){
//        ObjectC fatherA = new ObjectC();
//        fatherA.printf();
        System.out.println("time = " + getDayTime(1555055522L,1555061284L,10));
    }


    private static int getDayTime(Long startTime,Long endTime,Integer time){
        if(startTime != null && endTime != null){
            long  differTime =time*24*60*60 - (endTime - startTime) ;
            double differDay = differTime / (24*60*60*1.0);
            if(differDay >= 0.0d){
                return (int)differDay;
            }else{
                return (int)differDay -1;
            }
        }

        return 0;
    }

}
