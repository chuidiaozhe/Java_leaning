package com.kotlin.learning.jichushujuleixing

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray

fun main(args:Array<String>){
//     stringTest()
//    stringmobanTest()
    bijiaoDaxiaoTest()
}


/**
 * 可以使用下划线使数字常量更易读
 */
fun shujuleixingTest(){
    val oneMillion = 1_000_000
    val crediteCarNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_ED_5E
    val bytes = 0b1101_01101011011001
}

/**
 * kotlin中没有基础数据类型，只有封装的数字类型，每定义的一个变量，其实kotlin帮你封装了一个对象，这样可以保证不会出现空指针。数字类型也一样
 * ，所有在表两个数字的时候，就有比较数据大小和比较两个对象是否相等的区别。在kotlin中，三个等号===表示比较对象的地址，两个等号==表示比较两个
 * 值的大小
 * */
fun bijiaoDaxiaoTest(){
   val a :Int = 100
    println(a===a) //true,值相等，对象地址相等
    //经过了装箱，创建了两个不同的对象
    val boxedA :Int ? = a
    val anotherBoxedA :Int ? = a

    //虽然经过了装箱，但是值是相等的，都是100
    println(boxedA === anotherBoxedA) //true,值相等，对象的地址不相等
    println(boxedA == anotherBoxedA)//true,值相等
}

fun leixingzhuanhuanTest(){
    val b :Byte = 1 //Ok,字面值是静态监测的
//    val i: Int  = b // 错误
     val i :Int  = b.toInt()
    /**
     *  每种数据种类都有下面的这些方法，可以转换为其它的类型：
     *  toByte():Byte
     *  toShort():Short
     *  toInt():Int
     *  toLong():Long
     *  toFloat():float
     *  toDouble():double
     *  toChar():char
     * */

}

/**
 * 和Java中的char不一样，Kotlin中的Char不能直接和数字操作，Char必须要单引号'包含起来的
 * */
fun charTest(c :Char) : Int{
    if(c !in '0' .. '9'){
       throw IllegalArgumentException("out of range")
    }
    return c.toInt() - '0'.toInt()//显示转换为数字
}

/**
 * 数组用类Array实现
 * */
fun arrayTest(){
    //[1,2,3,4]
    val a  = arrayOf(1,2,3,4)
    //[0,2,4]
    val b  = Array(3,{i->(i*2)})
    //读取数组内容
    println(a.get(0))
    println(b[1])

    val x:IntArray = intArrayOf(1,3,4,5)

}
/**
 * kotlin支持三个括号"""扩起来的字符串，支持多行字符串
 * */
fun stringTest(){
  val text = """
      多行字符串
      多行字符串
  """
    println(text)
    //String可以通过trimMargin（）方法来删除多余的空白
    val text2 = """
        |多行字符串
        |菜鸟教程
        |多行字符串
        |Runoob
    """.trimMargin()
    println(text2)
}


fun stringmobanTest(){
    val i = 10
    val s = "i = $i "//求值结果为"i=0"
    println(s)

    val s1 = "kotlin"
    val str = "$s1.length  is ${s1.length}"
    println(str)

    val price = "${'$'}9.999"
    println(price)

}