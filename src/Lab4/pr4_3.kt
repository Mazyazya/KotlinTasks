package Lab4

fun main() {
    print("Введите число: ")
    val day = readln().toInt()
    when (day) {
        1 -> println("Кол")
        2 -> println("Двойка")
        3 -> println("Тройка")
        4 -> println("Четверка")
        5 -> println("Пятерка")
        else -> println("Нет такой оценки")
    }
}