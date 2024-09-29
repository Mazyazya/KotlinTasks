package Lab8

import kotlin.random.Random

fun main() {
    val arr = Array<Int>(10, {Random.nextInt(0, 100)})
    println("Лист: ${arr.joinToString()}")
    println("Сумма: ${sumOfArray(arr)}")
}

fun sumOfArray(arr: Array<Int>): Int{
    return arr.sum()
}