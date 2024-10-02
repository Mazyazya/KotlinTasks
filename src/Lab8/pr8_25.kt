package Lab8

fun main() {
    println("Введите первую строку: ")
    val str1 = readln()
    println("Введите вторую строку: ")
    val str2 = readln()
    println("Полученная строка:\n${concatinate(str1, str2)}")
}

fun concatinate(str1: String, str2: String): String = str1 + str2