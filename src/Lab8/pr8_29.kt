package Lab8

import kotlin.random.Random

fun main(){
    val arr = Array<Int>(10, { Random.nextInt(0, 100)})
    println("Массив: ${arr.joinToString()}")
    print("Максимальное и минимальное значение: ${maxmin(arr)}")
}

fun maxmin(arr: Array<Int>): Pair<Int, Int>{
    return Pair(arr.min(), arr.max())
}