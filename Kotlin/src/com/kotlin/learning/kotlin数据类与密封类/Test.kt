package com.kotlin.learning.kotlin数据类与密封类

fun main(args:Array<String>){
    var user = User("zhangsan",10)
    var oldUser = user.copy(age = 18)
    println(user.toString())
    println(oldUser.toString())
}