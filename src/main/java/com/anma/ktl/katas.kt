package com.anma.ktl

fun main(args: Array<String>) {
//    println(isDivisible(12, 3, 4))
//    println(solve("coDE"))
//    println(repeat_str(3, "Hello"))
//    println(dutyFree(12, 50, 1000))
//    println(digitize(348597))
//    println(reverseWords("The greatest victory is that which requires no battle"))
    println(maps(intArrayOf(1, 2, 3)))


}

fun solve(s: String): String {
    val array: Array<Char> = s.toCharArray().map { it.toChar() }.toTypedArray()

    var lower = 0
    var upper = 0
    var finalStr = ""

    for (elem in array) {
        if (elem.isLowerCase()) {
            lower++
        } else {
            upper++
        }
    }

    if (upper > lower) {
        finalStr = s.toUpperCase()
    } else finalStr = s.toLowerCase()

    return finalStr;
}

fun repeat_str(r: Int, str: String): String {
    var temp = ""
    for (a in 1..r) {
        temp += str
    }
    return temp
}

fun dutyFree(normPrice: Int, discount: Int, hol: Int): Int {
    var percent: Double = (discount.toDouble() / 100)
    var discSumm = normPrice * percent
    return (hol / discSumm.toInt())
//    return (hol / (normPrice * discount)) * 100
}

// Given a random non-negative number, you have to return the digits of this number within an array in reverse order. 348597 => [7,9,5,8,4,3]
// fun digitize(n: Long): IntArray {
fun digitize(n: Long): String {

    var str = n.toString()
    var strArr = str.toCharArray().reverse()
    return strArr.toString()

}

fun reverseWords(str: String): String {
    var list: List<String> = str.split(" ")
    val reverseArr = list.reversed()
    val str = reverseArr.joinToString(separator = " ")
    return str
}

fun maps(x: IntArray): IntArray {

    var arr: IntArray = IntArray(x.size)

    for (a in 0..x.size - 1) {
        arr[a] = x[a] * 2
    }
    return arr

}




