package com.kotlin.learning.tiaojiankongzhi

import com.apple.eawt.AppEvent

fun main(args : Array<String>){

}


fun ifTest(a :Int,b : Int){
    //传统用法
    var max = a
    if(a < b){
        max  = b
    }


    //使用else

    var max2 :Int
    if(a > b){
        max2 = a
    }else{
        max2 = b
    }

    //作为表达式
    val max3:Int = if(a > b) a else b

    val max4 = if(a > b){
       print("Choose a")
        a
    }else{
        print("Choose b")
        b
    }

    var x = 0
    if(x > 0){
       println("x 大于0")
    }else if(x == 0){
       println("x 等于0")
    }else{
        println("x小于0")
    }

    var a = 1
    var b = 2
    var  c = if(a >= b) a else b
    println("c的值为$c")

    val y = 5
    val z = 9
    if(x in 1..8){
      println("x在区间内")
    }

}

fun whenTest(x : Int){
    //等于某个数
    when(x){
        1 -> println("x == 1")
        2 -> println("x == 2")
        else ->{
            println("x 不是1 ，也不是2")
        }
    }
     //在某几个数之中
    when(x){
        0,1 -> println("x == 0 or x == 1")
        else ->{
            print("other wise")
        }
    }
    //在一个区间
    when(x){
        in 1..10 -> print("x is in the range")
        in intArrayOf(1,2,4) -> print("x is valid")
        !in 10..20 -> println("x is outside the range")
        else ->{
            println("none of the above")
        }
    }

    fun hasPrefix(x :Any) = when(x){
        is String -> x.startsWith("prefix")
        else -> false
    }
}

fun whenExample(){
    var x  = 0
    when(x){
        0,1-> println("x ==0  or x == 1")
        else -> println("otherview")
    }

    when(x){
       1 -> println("x == 1")
       2 -> println("x == 2")
        else->{
            println("x 不是1，也不是2")
        }
    }

    when(x){
      in 0..10 -> println("x在该区间范围内")
        else -> println("x 不在该区间范围内")
    }
}