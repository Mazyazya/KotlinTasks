package Lab8

import kotlin.random.Random

fun main(){
    val arr = Array<Int>(10, { Random.nextInt(0, 100)})
    println("Массив: ${arr.joinToString()}")
    print("Реверс: ${rev(arr)}")
}

fun rev(arr: Array<Int>): List<Int> = arr.reversed()