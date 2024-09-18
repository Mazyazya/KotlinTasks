package Lab5

fun main() {
    println("Введите число")
    val a = readln()
    var sum = 0
    for(i in a) {
        sum += i.toString().toInt()
    }
    println("Сумма цифр чисел = $sum")
}