package com.kotlin.learning.kotlin范型

class Box<T> (t:T){
    val value =t
}

fun  main(args:Array<String>){
    var intB = Box(10)
    var stringB = Box("test")
    println(intB.value)
    println(stringB.value)

    doPrintln("hahha")
    doPrintln(10)
    doPrintln(false)
}

fun <T> doPrintln(content :T){
    when(content){
        is Int -> println("整数型数字为：$content")
        is String -> println("字符串转换为大写：${content.toUpperCase()}")
        else -> println("T 不是整型也不是字符串")
    }
}