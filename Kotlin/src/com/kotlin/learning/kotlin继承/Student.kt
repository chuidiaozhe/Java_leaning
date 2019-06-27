package com.kotlin.learning.kotlin继承

class Student(name :String,age:Int,var no:String,var score:Int) :Person(name,age) {

}

fun main(args : Array<String>){
    var student = Student("Run",18,"122",89)
    println("学生名：${student.name}\n年龄：${student.age}\n学生号：${student.no}\n成绩：${student.score}")
}