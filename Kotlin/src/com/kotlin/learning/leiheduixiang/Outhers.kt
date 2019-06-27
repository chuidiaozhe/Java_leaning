package com.kotlin.learning.leiheduixiang

class Outhers {
    private var bar :Int = 1
    var v = "成员属性"
    /**嵌套内部类*/
    inner class Inner{
        fun foo() = bar
        fun innerTest(){
            var o = this@Outhers
            println("内部类引用外部类的成员，例如：" + o.v)
        }
    }
}

fun main(args:Array<String>){
    var  demo : Outhers.Inner = Outhers().Inner()
    println(demo.foo())
    println(demo.innerTest())
}