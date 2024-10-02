package Lab8

fun main() {
    print("Введите строку: ")
    val text = readln()
    print("Введите количество повторений: ")
    val n = readln().toInt() - 1
    println("Строка: ${repetition(text, n)}")
}

fun repetition(text: String, n: Int): String {
    var retText = text
    if (n > 0)
        retText += repetition(text, n - 1)
    return retText
}