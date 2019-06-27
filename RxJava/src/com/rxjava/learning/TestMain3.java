package com.rxjava.learning;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMain3 {
    public static void main(String args[]){
//           testMap();
//        testMatcher1();
//        testMathcer();
//        testMatcher2();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ahh:mm:ss");
        System.out.println("time : " + sdf.format(new Date(System.currentTimeMillis())));
    }

    private static void testMatcher1() {
        Pattern pattern =  Pattern.compile("\\d{1,9}");
        Matcher matcher =  pattern.matcher("143&&11");
        System.out.println("matcher.find " +  matcher.find());
        System.out.println("matcher.group " +  matcher.group());
        System.out.println("matcher.find " +  matcher.find());
        System.out.println("matcher.group " +  matcher.group());
        System.out.println("matcher.matches " +  matcher.matches());
    }

    /**
     * 测试正则表达式分组
     * */
    public static void testMathcer(){
        Pattern pattern = Pattern.compile("([a-z]+)([0-9]+)");
        Matcher matcher = pattern.matcher("ada112&kdkf232&dfjd2332");
        System.out.println("count  :" + matcher.groupCount());
        while (matcher.find()){
            System.out.println("   ====="+ matcher.group());
            System.out.println(" 0 ====="+matcher.group(0));
            System.out.println(" 1 ====="+matcher.group(1));
            System.out.println(" 2 ====="+matcher.group(2));
        }

     }
     /***
      * 正则表达式测试替换操作
      * */
     private static  void testMatcher2(){
      Pattern pattern = Pattern.compile("[0-9]");
      Matcher matcher = pattern.matcher("djfak33545jk4j5435j2j5");

      //替换
         String newStr = matcher.replaceAll("");
         System.out.println("newStr : " + newStr);

         String phone = "14589843431";
         String phoneNum = phone.replaceAll("(\\d{3})(\\d{4})(\\d{4})","$1*****$2");
         System.out.println("phoneNum  : " + phoneNum);
     }

    private static  void testMatcher3(){
        Pattern pattern = Pattern.compile("");
        Matcher matcher = pattern.matcher("djfak33545jk4j5435j2j5");

        //替换
        String newStr = matcher.replaceAll("");
        System.out.println("newStr : " + newStr);
    }

    /**
     * 测试数据转换
     * */
    public static void testMap(){
        Observable.just(124).map(new Func1<Integer, String>() {
            @Override
            public String call(Integer integer) {
                return integer + "";
            }
        }).subscribe(new Subscriber<String>(){

            @Override
            public void onCompleted() {
              System.out.println(" onCompleted ");
            }

            @Override
            public void onError(Throwable throwable) {
               System.out.printf("onError");
            }

            @Override
            public void onNext(String s) {
              System.out.println("onNext  : " + s);
            }
        });
    }
}
