package Lab5

fun main() {
    println("Введите число")
    val N = readln().toInt()
    var sumOdd: Int = 0
    var sumEven: Int = 0
    for(i in 1..N){
        if (i % 2 == 0) sumEven += i
        else sumOdd += i
    }
    println("Сумма четных чисел от 1 до $N = $sumEven")
    println("Сумма нечетных чисел от 1 до $N = $sumOdd")
}