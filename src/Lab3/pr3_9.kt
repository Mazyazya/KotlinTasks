fun main(){
    println("Введите число m: ")
    val m = readln().toInt()
    println("Введите число n: ")
    val n = readln().toInt()

    if (m % n == 0) println("$m делится нацело на $n\n$m / $n = ${m/n}")
    else println("$m на $n нацело не делится")
}