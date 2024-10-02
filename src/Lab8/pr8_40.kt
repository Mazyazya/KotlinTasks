package Lab8

import kotlin.random.Random

fun main(){
    val arr = Array<Int>(10, { Random.nextInt(0, 100)})
    println("Массив: ${arr.joinToString()}")
    print("Копия массива: ${cop(arr).joinToString("  ")}")
}

fun cop(arr: Array<Int>): Array<Int> = arr.copyOf()