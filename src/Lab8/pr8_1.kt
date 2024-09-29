package Lab8

import kotlin.random.Random

fun main() {
    val list = List<Int>(10, {Random.nextInt(0, 100)})
    println("Лист: ${list.joinToString()}")
    println("Сумма: ${sumOfList(list)}")
}

fun sumOfList(list: List<Int>): Int{
    return list.sum()
}