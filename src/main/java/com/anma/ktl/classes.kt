package com.anma.ktl

data class Person(var firstName: String, var lastName: String = "")

val petro = Person("Petro", "Muzyka");

fun changeName(newLastName: String) {
    petro.lastName = newLastName;
}

fun main(args: Array<String>) {
    println(petro.firstName)
    changeName("New name")
    println(petro.lastName)

}