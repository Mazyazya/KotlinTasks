package Lab6

import kotlin.random.Random

fun main(){
    val n = 10
    val arr1 =  Array(n, { Random.nextInt(0, 100) })
    val arr2 =  Array(n, { Random.nextInt(0, 100) })
    println("Массив 1:\n${arr1.joinToString()}")
    println("Массив 2:\n${arr2.joinToString()}")
    println()
    println("Пересечения массивов: ${arr1.intersect(arr2.toSet()).joinToString()}")
}