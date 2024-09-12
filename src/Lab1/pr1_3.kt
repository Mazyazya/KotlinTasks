package Lab1

import kotlin.math.exp

fun main() {
    var num = String.format("%.3f", exp(1.0)).toDouble()
    println("Your number is $num")
}