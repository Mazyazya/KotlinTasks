package Lab2

fun main() {
    print("Введите число: ")
    val num = readln()

    println("Число десятков ${num[1]}")
    println("Число единиц ${num[2]}")
    println("Сумма чисел ${num[0].toString().toInt() + num[1].toString().toInt() + num[2].toString().toInt()}")
    println("Произведение чисел ${num[0].toString().toInt() * num[1].toString().toInt() * num[2].toString().toInt()}")
}