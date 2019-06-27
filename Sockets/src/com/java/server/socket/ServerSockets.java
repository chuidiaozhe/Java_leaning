package com.java.server.socket;


 import java.awt.*;
 import java.io.IOException;
import java.math.BigDecimal;
 import java.text.DateFormat;
 import java.text.DecimalFormat;
 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 import java.util.Random;
 import java.util.regex.Matcher;
 import java.util.regex.Pattern;


public class ServerSockets {
    public static long FILE_BYTE = 1;
    public static long FILE_KB = FILE_BYTE * 1000;
    public static long FILE_M = FILE_KB * 1000;
    public static long FILE_G = FILE_M * 1000;

    public static DecimalFormat fileFormat = new DecimalFormat("#.00");
     public static void main(String args[])   {
         Random random = new Random();
         System.out.println("random : " + random.nextInt(10));

     }

    /**
     * 将文件大小转换成指定格式
     * @param size
     * @return
     */
    public static String getFileSize(long size){
        String result = "";
        if(size >= FILE_G){
            result = fileFormat.format(size / (FILE_G * 1.0)) + "G";
        }else if(size >= FILE_M){
            result = fileFormat.format(size / (FILE_M * 1.0)) + "M";
        }else if(size >= FILE_KB){
            result = fileFormat.format(size / (FILE_KB * 1.0)) + "KB";
        }else {
            result = fileFormat.format(size / (FILE_BYTE* 1.0)) + "字节";
        }
        return  result;
    }


    public static  float get2ScaleFloat(float val){
         return getScaleFloat(val,2);
     }

     public static double get2ScaleDouble(float val){
         return getScaleDouble(val,2);
     }

     public static float getScaleFloat(float value,int newScale){
         float result = value;
         result = (float) (value*Math.pow(10d,newScale)+0.5f);
         String str = result + "";
         result = (float) (Float.valueOf((str).substring(0,str.indexOf(".")))/Math.pow(10d,newScale));
         return result;
     }

    public static double getScaleDouble(double value,int newScale){
        double result = value;
        result =   (value*Math.pow(10d,newScale)+0.5f);
        String str = result + "";
        result =   (Float.valueOf((str).substring(0,str.indexOf(".")))/Math.pow(10d,newScale));
        return result;
    }
}
