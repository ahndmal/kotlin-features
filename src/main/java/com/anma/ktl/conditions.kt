package com.anma.ktl

import kotlin.random.Random

fun main(args: Array<String>) {

    val list: List<Any> = listOf(1, "A", 3.4, "G")

    for (el in list) {
        when(el) {
            is String -> println("String")
            is Int -> println("Int")
            is Double -> println("Double")
        }
    }

    // ------------------------------------
    // if ternary alternative

    val a: Int = Random.nextInt()
    val b: Int = if (a < 10) 9 else 11

    val c = 1
    val d = 2

    println(if (a > b) a else b) // Returns a value: 2

    // ------------------------------------
    // when

    val obj = "Hello"

    val result = when (obj) {
        // If obj equals "1", sets result to "one"
        "1" -> "One"
        // If obj equals "Hello", sets result to "Greeting"
        "Hello" -> "Greeting"
        // Sets result to "Unknown" if no previous condition is satisfied
        else -> "Unknown"
    }
    println(result)

    // ------------------------------------

    val temp = 18

    val description = when {
        // If temp < 0 is true, sets description to "very cold"
        temp < 0 -> "very cold"
        // If temp < 10 is true, sets description to "a bit cold"
        temp < 10 -> "a bit cold"
        // If temp < 20 is true, sets description to "warm"
        temp < 20 -> "warm"
        // Sets description to "hot" if no previous condition is satisfied
        else -> "hot"
    }
    println(description)


}