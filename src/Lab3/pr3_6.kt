fun main(){
    println("Введите год: ")
    val a = readln().toInt()

    if ((a % 400 == 0) or ((a % 100 != 0) and (a % 4 == 0))) println("Год високосный")
    else println("Год невисокосный")
}