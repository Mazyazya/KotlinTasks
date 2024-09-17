package Lab4

fun main(){
    print("Введите число: ")
    val str = readln().toInt()
    when (str) {
        in 1..2147483647 -> println("Число положительное")
        in -2147483647..-1 -> println("Число отрицательное")
        0 -> println("Число - ноль")
    }
}
