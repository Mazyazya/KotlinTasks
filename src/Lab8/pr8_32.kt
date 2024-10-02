package Lab8

fun main() {
    println("Введите строку:")
    val str = readln()
    println("Её реверс: ${reverse(str)}")
}

fun reverse(str: String): String = str.reversed()