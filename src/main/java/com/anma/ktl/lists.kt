package com.anma.ktl

fun main(args: Array<String>) {

    val set1 = HashSet<String>()
    set1.add("String 1")
    set1.add("String 2")
    set1.stream().filter { el -> el.contains("Str") }.forEach { el -> println(el) }

    //    val list = arrayOf("a", 1, "c");
    //    list.forEach { el -> println(el) }

    for (a in 1..10) {
        println("Digit is $a")
    }

    val listOfInts: List<Int> = listOf(1, 2, 3, 4);
    print(listOfInts.get(0))

    val set: Set<Int> = setOf<Int>(1, 2, 3, 4, 5)
    val map: Map<String, Int> = mapOf("one" to 1, "two" to 2)

    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)
    // {apple=100, kiwi=190, orange=100}

    // Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)
    // {apple=100, kiwi=190, orange=100}

}