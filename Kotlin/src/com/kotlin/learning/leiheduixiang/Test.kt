package com.kotlin.learning.leiheduixiang

class Test {
    var v = "成员属性"
    fun setInterface(test : TestInterface){
          test.test()
    }
}

interface  TestInterface{
    fun test()
}

fun  main(args:Array<String>){
    var test = Test()
    test.setInterface(object :TestInterface{
        override fun test() {
            println("对象表达式创建匿名内部类的实例")
         }
    })
}