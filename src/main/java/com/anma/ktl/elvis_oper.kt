package com.anma.ktl

/*
ou can provide a default value to return if a null value is detected by using the Elvis operator ?:.

Write on the left-hand side of the Elvis operator what should be checked for a null value.
Write on the right-hand side of the Elvis operator what should be returned if a null value is detected.

In the following example, nullString is null so the safe call to access the length property returns a null value.
As a result, the Elvis operator returns 0:
 */

fun main() {
    val nullString: String? = null
    println(nullString?.length ?: 0)
    // 0
}