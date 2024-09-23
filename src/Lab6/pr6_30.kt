package Lab6

import kotlin.random.Random

fun main() {
    val N = 10
    val arr = Array<Int>(N, { Random.nextInt(0, 100) })
    println("Выводим массив?: ")
    if (readln().lowercase() == "да") print(arr.joinToString(" "))
    else print("Ну ладно")
}
