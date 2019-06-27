package com.kotlin.learning.leiheduixiang

class Person(firstName:String?){
    var userName : String? = firstName
    get() = field
    set(value){
        field = value
    }

    var age :Int = 18
    get() = field
    set(value) {
        field = value
    }
}