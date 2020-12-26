package com.anma.ktl

class FastestWay {

    fun shortestTime(distanceToA: Int, distanceToB: Int, carSpeed: Int, trainSpeed: Int): String {

        val timeToA = distanceToA / carSpeed
        val timeToB = distanceToB / trainSpeed
        if (timeToA == timeToB) return "Any City"

        return if (timeToA < timeToB) "City A: $timeToA hour(s)" else "City B: $timeToB hour(s)"
    }


}

fun main() {

    println(FastestWay().shortestTime(100, 100, 50, 50))
    println(FastestWay().shortestTime(90, 80, 50, 40))

}