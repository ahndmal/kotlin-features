package com.anma.ktl

fun main() {

    val short: Short = 10;
    val int: Int = 45000;
    val double: Double = 13.2;
    val float: Float = 4.5F;
    val long: Long = 1000L;

    val a: Int = double.toInt();

    val d: Double = 12.4 // it has some value

    val i = d.toInt()    // 1
    val s = d.toString() // 2
    val f = d.toFloat()  // 3

//    println(35.0 / 100 * 3)
//    print(a)

    println(i)
    println(s)
    println(f)

}