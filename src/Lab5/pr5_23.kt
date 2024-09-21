package Lab5

fun main() {
    println("Введите 'стоп' для завершения программы.")
    println("Введите первую цифру:")
    val a = readln().toInt()
    println("Введите вторую цифру:")
    val b = readln().toInt()
    var mult = 1; var sum = 0
    while (true) {
        sum += a + b
        mult *= a * b
        println("Сумма: $sum")
        println("Произведение: $mult")
        println("Продолжаем?")
        if (readln() == "стоп") break
    }
}