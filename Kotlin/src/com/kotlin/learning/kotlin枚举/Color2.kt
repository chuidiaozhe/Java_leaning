package com.kotlin.learning.kotlin枚举

enum class Color2(var rgb:Int) {
    RED(0xFF0000),
    GREEN(0x00FF00)

}

fun main(args:Array<String>){
    var color:Color2 = Color2.GREEN
    println(color.rgb)
    println(color.name)
    println(color.ordinal)
}