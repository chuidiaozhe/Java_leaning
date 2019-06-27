package com.kotlin.learning.kotlin接口

interface MyInterface {
    //接口中的属性只能是抽象的，不允许初始化值，接口不会保存属性值，实现接口时，必须重写属性
    var name :String
    fun bar()//未实现
    fun foo(){//已实现
        //可选的方法体
        println("foo")
    }
}