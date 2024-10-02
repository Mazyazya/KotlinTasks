package Lab8

fun main() {
    println("Введите строку: ")
    val str = readln()
    println("В вашей строке ${charCounter(str)} символов")
}

fun charCounter(str: String): Int = str.length