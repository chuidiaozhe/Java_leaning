package com.kotlin.learning.kotlin继承
/**用户基类*/
open class Person2 (name:String){
    open val school:String  = "xuexiao"
    constructor(name:String,age:Int):this(name){
        //初始化
        println("-------基类次级构造函数--------")
    }

    open  fun study(){
        println("我毕业了")
    }
}
