package com.kotlin.learning.kotlin接口

class Child :MyInterface {
    override var name :String = "roob"
    override fun bar() {
        println("bar")
     }


}


fun main(args:Array<String>){
    var child = Child()
    child.bar()
    child.foo()
    fun Child.printf(){
        println("Child扩展函数")
    }
    child.printf()


}