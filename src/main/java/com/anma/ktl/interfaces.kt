package com.anma.ktl

interface Animal {
    fun eat()
}

class Dog: Animal {

    var name: String = "";

    override fun eat() {
        println("Eating!")
    }
}

fun main(args: Array<String>) {
    val tuzik: Animal = Dog();
//    tuzik.name = "Tuzik";
//    println(tuzik.name)
    tuzik.eat()
}