package com.kotlin.learning.jichuyufa

/***
 * var修饰可变变量
 * val修饰不可变变量
 * */
val a:Int  = 1
val b:Int  = 1
val c:Int = 0
var x :Int  = 5
var d  = 5

fun main(args : Array<String>){

   vars(1,2,4,5,6)
    d = d+1
 }

//函数定义使用关键字 fun，参数格式为：参数 : 类型
fun sum(a : Int,b : Int) : Int {
   return a+b
}

//表达式作为函数体，返回类型自动判断
public fun sumA(a : Int,b : Int) :Int = a+b

//没有返回值
fun printSum(a :Int ,b:Int) :Unit{
    println(a+b)

}
//如果返回Unit类型，则可以省略（对于public方法也是这样）
public fun printsum(a:Int,b:Int){
    print(a+b)
}
//可变长参数函数可以用vararg进行标识
fun vars(vararg v:Int){
   for (vt in  v){
       println(vt)
   }
}

//测试字符串模版
fun stringTemplate() : Unit{
    /**
     * $表示一个变量名或变量值
     * $varName 表示变量值
     * ${varName.fun()}表示变量的方法返回值
     * */
   var a  = 1;
    var s1 = "a is $a"
    a  =2;
    val s2 = "${s1.replace("is","was")} ,but now is $a"
}

fun nullTest(){
    //类型后面加？表示可为空
    var age:String?  = ""
    //抛出空异常
    val ages = age!!.toInt()
    //不做处理返回null
    var ages1 : Int? = age.toInt()
    //age为空返回-1
    var ages2:Int = age?.toInt()?:-1
}

/**
 * 区间表达式由具有操作符形式..的rangeTo函数辅以in和!in行成
 * */
fun rangeTest(){
    for (i  in 1..4) print(i)//输出"1234"
    for (i in 4..1) print(i)//什么都不输出
    var i :Int? = 1
    if(  i  in 1..10){//等同于i >= 1 && i<= 10
        print(i)
    }
    //使用step指定步长
    for (i in 1..4 step 2) print(i) //输出"13"

    for (i in 1 downTo  4 step 2) print(i) //输出"42"

    //使用until函数排除结束元素
    for (i in 1 until 10){//i in[1,10)排除了10
        println(i)
    }

    //实例测试
    print("循环输出：")
    for (i in 1..4) print(i) //输出"1234"

    println("设置步长")
    for (i in 1..4 step 2) print(i) //输出"13"

    print("使用downTo")
    for (i in 4 downTo 1 step 2) print(i) //输出"42"

    print("使用until")
    for (i in 1 until 4){//i in [1,4)排除了4，输出"123"
        print(i)
    }
}