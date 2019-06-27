package com.kotlin.learning.kotlin继承

class Student2 :Person2  {
    override var school :String = "haha"
    get() = field
    set(value) {
        field  =value
    }
constructor(name:String,age:Int,no:String,score:Int) :super(name ,age){
println("--------继承类次级构造函数--------")
    println("学生名：${name}")
    println("年龄：${age}")
    println("学生号：${no}")
    println("成绩：${score}")
}

    override fun study() {
//        super<Person2>.study()
         println("我在读大学")
    }
}

fun main(args : Array<String>){
    var s = Student2("Runoob", 18, "S12345", 89)
    s.study()
    println( s.school)
}