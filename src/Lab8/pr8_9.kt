package Lab8

import kotlin.math.pow

fun main() {
    print("Введите число k: ")
    val k = readln().toInt()
    print("Введите число n: ")
    val n = readln().toInt()
    println("$k^$k == $n: ${isPowerEqualN(k.toDouble(), n.toDouble())}")
}

fun isPowerEqualN(k: Double, n: Double): Boolean = (k.pow(k) == n)