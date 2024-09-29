package Lab8

import kotlin.random.Random

fun main() {
    val list = List<Int>(10, { Random.nextInt(0, 100)})
    println("Лист: ${list.joinToString()}")
    println("Разница максимального и минимльного: ${difference(list)}")
}

fun difference(list: List<Int>): Int = list.max() - list.min()
