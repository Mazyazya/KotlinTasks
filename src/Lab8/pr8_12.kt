package Lab8

fun main() {
    print("Введите число: ")
    val n = readln().toInt()
    println("Строка: ${google(n)}")
}

fun google(n: Int): String {
    return "G" + "o".repeat(n) + "gle"
}