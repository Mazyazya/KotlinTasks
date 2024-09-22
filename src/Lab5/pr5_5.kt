package Lab5

fun main() {
    println("Введите число")
    val N = readln().toInt()
    if (isSimple(N)) println("Число простое")
    else println("Число непростое")
}

fun isSimple(num: Int): Boolean {
    if (num in 0..1) return false
    for(i in 1..num-1) {
        if ((i == 1)) continue
        else if (num % i == 0) return false
    }
    return true
}