package com.anma.ktl

fun main(args: Array<String>) {

// Array of int of size 5 with values [0, 0, 0, 0, 0]
    val arr = IntArray(5)

    var miscArray = arrayOf(1, "a", 3.2)

    var intArray = intArrayOf(1, 2, 3, 4)

    var lambdaArray = Array(5) {i -> i + i}
//    lambdaArray.forEach { println(it) }

// Array of int of size 4 with values [42, 42, 42, 42]
    var constArr = Array(4) { 42 }
    constArr.forEach { el -> println(el) }


}
