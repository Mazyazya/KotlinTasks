package Lab8

fun main() {
    print("Введите перове число: ")
    val a = readln().toInt()
    print("Введите второе число: ")
    val b = readln().toInt()
    val func = fun(a: Int, b: Int): Int = a + b
    println("Сумма: ${func(a, b)}")
}

