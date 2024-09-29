package Lab8

fun main() {
    print("Введите перове число: ")
    val a = readln().toInt()
    print("Введите второе число: ")
    val b = readln().toInt()
    println("Сумма меньше 100: ${sumIsMoreThan100(a, b)}")
}

fun sumIsMoreThan100(a: Int, b: Int): Boolean = (a + b < 100)