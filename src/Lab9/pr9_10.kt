package Lab9

fun main() {
    print("Введите предложение: ")
    val list = readln().replace(Regex("[,.:!?]"), "").split(" ")
    println("Самое длинное слово: ${list.max()}")
}