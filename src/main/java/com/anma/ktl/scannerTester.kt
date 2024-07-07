package com.anma.ktl

import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    val room = scanner.next()

    when(room) {
        "rectangle" -> {
            val a = scanner.nextDouble()
            val b = scanner.nextDouble()
            print(a * b)
        }
        "triangle" -> {
            val a = scanner.nextDouble()
            val b = scanner.nextDouble()
            val c = scanner.nextDouble()
            val s = (a + b + c) / 2
            print(Math.sqrt(s*(s-a)*(s-b)*(s-c)))
        }
        "circle" -> {
            val r = scanner.nextDouble()
            print(Math.PI * Math.pow(r, 2.0))
        }
    }


}