package Lab9


fun main() {
    print("Введите число: ")
    val n = readln().toInt()
    for (i in 0..n)
        if (isSimple(i)) println(i)
}

fun isSimple(num: Int): Boolean {
    if (num in 0..1) return false
    for(i in 1..num-1) {
        if ((i == 1)) continue
        else if (num % i == 0) return false
    }
    return true
}