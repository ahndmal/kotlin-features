package com.anma.ktl

import java.time.Duration
import java.time.LocalDateTime
import java.time.Period

fun main(args: Array<String>) {

    var localDate: LocalDateTime = LocalDateTime.now();
    println(localDate.month)

    val days = Period.ofWeeks(8).days
    println(days)

    val seconds = Duration.ofHours(1000).seconds
    println(seconds)

}