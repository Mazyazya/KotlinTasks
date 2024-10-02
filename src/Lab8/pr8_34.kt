package Lab8

fun main() {
    println("Введите строку: ")
    val str = readln()
    println(deleteSpaces(str))
}
fun deleteSpaces(str: String): String = str.replace(" ", "")