package Lab6

import kotlin.random.Random

fun main() {
    val N = 100
    val arr = Array<Int>(N, { Random.nextInt(0, 100) })
    println("Выводим массив?: ")
    for (i in 0..N-1) {
        if (i % 5 == 0) println()
        print("${arr[i]} ")
    }
}
