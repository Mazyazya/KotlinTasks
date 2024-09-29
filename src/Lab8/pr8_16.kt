package Lab8

fun main() {
    print("Введите число: ")
    val a = readln().toInt()
    println("Четное ли число: ${isEven(a)}")
}

fun isEven(a: Int): Boolean = a % 2 == 0
