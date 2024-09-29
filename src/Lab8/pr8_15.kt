package Lab8

fun main() {
    print("Введите перове число: ")
    val a = readln().toInt()
    print("Введите второе число: ")
    val b = readln().toInt()
    println("Сумма: ${comparison(a, b)}")
}

fun comparison(a: Int, b: Int){
    if (a > b) println("$a больше $b")
    else println("$b больше $a")
}