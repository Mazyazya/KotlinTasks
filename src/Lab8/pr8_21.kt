package Lab8

import kotlin.random.Random

fun main() {
    var arr = Array<Int>(10, { Random.nextInt(0, 100)})
    println("Лист: ${arr.joinToString()}")
    sortedArr(arr)
    println("Лист: ${arr.joinToString()}")
}

fun sortedArr(arr: Array<Int>) = arr.sort()
