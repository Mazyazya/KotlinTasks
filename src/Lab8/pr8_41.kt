package Lab8

fun main() {
    println("Введите строку: ")
    val str = readln()
    println("В строке ${vowels(str)} гласных")
}

fun vowels(str: String): Int  = str.filter { it in "АОУЫЭЕЁИЮЯаоуыэеёиюя" }.length