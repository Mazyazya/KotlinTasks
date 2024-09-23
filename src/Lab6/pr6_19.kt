package Lab6

import kotlin.random.Random

fun main(){
    val N = 5
    val M = 7
    val arr1 = Array<Int>(N, {Random.nextInt(0, 100)})
    val arr2 = Array<Int>(M, {Random.nextInt(0, 100)})
    println("Первый отсортированный массив:\n${arr1.sorted().joinToString()}")
    println("Второй отсортированный массив:\n${arr2.sorted().joinToString()}")
    println("Объединение массивов:\n${arr1.plus(arr2).sorted().joinToString()}")
}
