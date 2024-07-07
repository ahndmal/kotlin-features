package com.anma.ktl

fun main(args: Array<String>) {

    for (x in 1..5) {
        print(x)
    }

    for (i in 1..3) {
        for (j in 1..i) {
            println(j)
        }
    }

    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }

    var cakesEaten = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }

    // do-while

    var cakesEaten2 = 0
    var cakesBaked2 = 0
    while (cakesEaten2 < 3) {
        println("Eat a cake")
        cakesEaten2++
    }
    do {
        println("Bake a cake")
        cakesBaked2++
    } while (cakesBaked2 < cakesEaten2)
   

}