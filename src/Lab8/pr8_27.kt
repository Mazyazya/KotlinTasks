package Lab8

import kotlin.random.Random

fun main(){
    val arr = Array<Int>(10, { Random.nextInt(0, 100)})
    println("Массив: ${arr.joinToString()}")

    print("Введите число: ")
    val num = readln().toInt()

    if(isNuum(arr, num)) println("Такое число есть")
    else println("Такого числа нет")
}

fun isNuum(arr: Array<Int>, num: Int): Boolean = num in arr