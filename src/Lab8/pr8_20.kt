package Lab8

import kotlin.random.Random

fun main() {
    val arr = Array<Int>(10, { Random.nextInt(0, 100)})
    println("Лист: ${arr.joinToString()}")
    println("Сумма: ${maxNum(arr)}")
}

fun maxNum(arr: Array<Int>): Int{
    return arr.max()
}