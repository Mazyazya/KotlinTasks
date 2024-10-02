package Lab8

import kotlin.random.Random

fun main(){
    val arr = Array<Int>(10, { Random.nextInt(0, 100)})
    println("Массив: ${arr.joinToString()}")
    print("Введите индекс: ")
    val ind = readln().toInt()
    println("Это число - ${index(arr, ind)}")
}

fun index(arr: Array<Int>, index: Int): Int = arr[index]