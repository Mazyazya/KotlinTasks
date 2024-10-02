package Lab8

fun main() {
    print("N = ")
    val N = readln().toInt()
    println("Сумма чисел в диапазоне от 1 до $N = ${sumNum(N)}")
}

fun sumNum(N: Int): Int = (1..N).sum()