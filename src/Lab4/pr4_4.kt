package Lab4

fun main() {
    print("Введите время суток: ")
    val str = readln()
    val num = str.substring(0, str.indexOf(':')).toInt()
    when (num) {
        in 1..5 -> println("Ночь")
        in 6..11 -> println("Утро")
        in 12..17 -> println("День")
        in 18..24 -> println("Вечер")
    }
}