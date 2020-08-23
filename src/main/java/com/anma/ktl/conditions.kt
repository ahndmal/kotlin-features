package com.anma.ktl

fun main(args: Array<String>) {

    val list: List<Any> = listOf(1, "A", 3.4, "G")
    for (el in list) {
        when(el) {
            is String -> println("String")
            is Int -> println("Int")
            is Double -> println("Double")
        }
    }
}