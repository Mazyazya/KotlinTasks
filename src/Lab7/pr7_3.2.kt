package Lab7

fun main() {
    println("Введите последовательность чисел")
    val arr = readln().split(" ").map(String::toInt)
    println("Минималаьноче число в последовательности: ${arr.min()}")
}
