package Lab2

fun main() {
    print("Введите число: ")
    val num = readln()

    println("Число десятков\t\t ${num[0]}")
    println("Число единиц\t\t ${num[1]}")
    println("Сумма чисел\t\t\t ${num[0].toString().toInt() + num[1].toString().toInt()}")
    println("Произведение чисел\t ${num[0].toString().toInt() * num[1].toString().toInt()}")
}
