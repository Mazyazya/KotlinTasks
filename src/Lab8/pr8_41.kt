package Lab8

fun main() {
    println("Введите строку: ")
    val str = readln()
    println("В строке ${vowels(str)} гласных")
}

fun vowels(str: String): Int {
    return str.toCharArray().intersect("АОУЫЭЕЁИЮЯаоуыэеёиюя".toSet()).size
}