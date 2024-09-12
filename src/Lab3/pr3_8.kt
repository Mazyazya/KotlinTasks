fun main(){
    println("Введите растояние в км: ")
    val a = readln().toDouble()
    println("Введите расстояние в футах: ")
    val b = readln().toDouble()

    if (a > b * 0.305) println("$a км больше $b футов (${b * 0.305} км)")
    else println("$a км меньше $b футов (${b * 0.305} км)")
}