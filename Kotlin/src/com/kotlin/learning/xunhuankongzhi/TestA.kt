package com.kotlin.learning.xunhuankongzhi

fun main(args : Array<String>){
//   forTest()
//    whileTest()
    breakAndContinueTest()
}

fun forTest(){
    val items =  listOf("apple","banana","kiwi")

    for (item in items){
        println(item)
    }

    println("==================")

    for (index in items.indices){
        println("item at $index is ${items[index]}")
    }

    println("==================")

    for ((index,value) in items.withIndex()){
        println("item at $index is $value")
    }

}

fun whileTest(){
    println("------while 使用-----")
    var x = 5
    while (x > 0){
        println(x--)
    }
    println("--------do...while使用---------")
    var y = 5
    do {
        println(y--)
    }while (y> 0)
}

fun breakAndContinueTest(){
    for (i in 1..10){
        if(i == 3){
            continue
        }
        println(i)
        if(i > 5){
             break
        }
    }
}