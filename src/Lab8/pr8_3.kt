package Lab8

import kotlin.random.Random

fun main() {
    val list1 = List<Int>(10, { Random.nextInt(0, 100)})
    val list2 = List<Int>(10, { Random.nextInt(0, 100)})
    println("Лист1: ${list1.joinToString()}")
    println("Лист2: ${list2.joinToString()}")
    println("Объединение: ${concatinate(list1, list2)}")
}

fun concatinate(list1: List<Int>, list2: List<Int>): List<Int> = list1 + list2
