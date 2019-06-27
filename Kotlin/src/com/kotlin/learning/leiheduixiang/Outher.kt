package com.kotlin.learning.leiheduixiang

import com.sun.xml.internal.xsom.XSWildcard

class Outher {
    private val bar :Int = 1
    class Nested{
        fun foo()=2
    }
}

fun  main(args : Array<String>){
    val demo = Outher.Nested().foo()
    println(demo)
}