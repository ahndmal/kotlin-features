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
//    constArr.forEach { el -> println(el) }


    for (a in 1 until 4) {
        print(a)
    }
}

fun calculateYears(years: Int): Array<Int> {

    var catYears = 0
    var dogYears = 0

    if (years == 1) {
        catYears = 15
        dogYears = 15

    } else if (years == 2) {
        catYears = 24
        dogYears = 24
    } else {
        catYears = 24
        dogYears = 24
        for (a in 3 until years + 1) {
            catYears += 4
            dogYears += 5
        }
    }

    return arrayOf(years, catYears, dogYears)

}
