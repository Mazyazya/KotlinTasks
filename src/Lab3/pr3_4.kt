fun main(){
    println("Введите большее число: ")
    val a = readln().toInt()
    println("Введите меньшее число: ")
    val b = readln().toInt()

    if (a % b == 0) println("$a кратно $b")
    else println("$a не кратно $b\nОстаток: ${a % b}")
}