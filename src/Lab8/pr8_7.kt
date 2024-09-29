package Lab8

fun main() {
    print("Введите число: ")
    val a = readln().toInt()
    println("Число делится на 100: ${dividedBy100(a)}")
}

fun dividedBy100(a: Int): Boolean = (a % 100 == 0)