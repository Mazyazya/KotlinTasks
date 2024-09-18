package Lab5

fun main() {
    println("Введите число")
    val N = readln().toInt()
    if (isSimple(N)) println("Число простое")
    else println("Число непростое")
}

fun isSimple(fact: Int): Boolean {
    for(i in 1..fact-1) {
        if ((i == 1)) continue
        else if (fact % i == 0) return false
    }
    return true
}