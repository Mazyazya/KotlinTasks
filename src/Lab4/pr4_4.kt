package Lab4

fun main() {
    print("Введите время суток: ")
    val str = readln()
    val num = str.substring(0..1).toInt()
    when (num) {
        in 1..6 -> println("Ночь")
        in 6..12 -> println("Утро")
        in 12..18 -> println("День")
        in 18..24 -> println("Вечер")
    }
}