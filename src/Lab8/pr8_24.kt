package Lab8

fun main() {
    println("Введите строку: ")
    val str = readln()
    println(register(str))
}

fun register(str: String): String = str.uppercase()