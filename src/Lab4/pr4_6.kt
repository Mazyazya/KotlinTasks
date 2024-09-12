package Lab4

fun main() {
    print("Введите число: ")
    val num = readln().toInt()
    when (num) {
        228 -> println("Вы угадали")
        else -> println("Вы проиграли")
    }
}