fun main() {
    println("Введите число: ")
    val a = readln().toInt()

    if (a % 2 == 0) println("$a - четное") else println("$a - нечетное")
    if (a % 10 == 7) println("$a - оканчивается на 7") else println("$a - не оканчивается на 7")
}
