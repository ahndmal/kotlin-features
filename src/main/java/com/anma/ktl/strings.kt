package com.anma.ktl



fun main() {

    val str1: String = "Hello";
    val name: String = "Andrii";
    var str12 = "CoDe"
    val subStr1 = str1.substring(1, 4)

    val toSplit = "Hello there from the program"
    val array = toSplit.split(" ")
    val array2 = name.split("")
    val toStr1 = array2.joinToString(separator = "")
//    println(array2.toString())
//    println(toStr1)

    fun retStr(yearsOld: String): Int {
        return Integer.parseInt(yearsOld.substring(0, 1))
    }

    print(retStr("4 years old"))

//    println ("$str1 $name")
//    println(name[4])
//    println(str12.toLowerCase())
//    println(str12.toUpperCase())


}