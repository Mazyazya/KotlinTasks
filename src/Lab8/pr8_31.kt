package Lab8

import kotlin.random.Random

fun main(){
    val arr = Array<Int>(10, { Random.nextInt(0, 100)})
    println("Массив: ${arr.joinToString()}")
    print("Отсоритрованный массив: ${sortArr(arr).joinToString()}")

}

fun sortArr(arr: Array<Int>): List<Int> = arr.sorted()