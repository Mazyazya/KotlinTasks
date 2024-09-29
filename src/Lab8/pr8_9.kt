package Lab8

fun main() {
    print("Введите число k: ")
    val k = readln().toInt()
    print("Введите число n: ")
    val n = readln().toInt()
    println("$k^$k == $n: ${isPowerEqualN(k, n)}")
}

fun isPowerEqualN(k: Int, n: Int): Boolean = (k * k == n)