fun main(){
    println("Введите число: ")
    val a = readln().toInt()
    println("Введите число: ")
    val b = readln().toInt()

    if (a % b == 0) println("$b делитель числа $a")
    else println("$a на $b нацело не делится")
}
