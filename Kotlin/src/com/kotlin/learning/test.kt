package com.kotlin.learning

import sun.corba.Bridge

fun main() {

    var birthday :String= "19900112"
    System.out.println(birthday.substring(0,4) )
    System.out.println(birthday.substring(4,6) )
    System.out.println(birthday.substring(6,8) )
     var a : String?
    a = "abc"
    a?.run {
        println("run length ${this.length}")
    }
    a?.let {
        println("let length ${it.length}")
    }
    a?.let{
        hah->
        println("let hah length ${hah.length}")
        println("let hah length ${hah}")

    }

    a?.also {
        println("also ${it}")
        it.reversed()
    }.also {
        println("also ${it}")
        it.reversed()
    }.also {
        println("also ${it}")
        it.reversed()
    }.let {
        println("let ${it}")
        it.reversed()
    }.let {
        println("let ${it}")
        it.toUpperCase()
    }.apply {
        println("apply ${this}")
        this.toLowerCase()
     }.let {
        println("let ${it}")
    }

}