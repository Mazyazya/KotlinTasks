package Lab8

fun main() {
    print("Введите число: ")
    val a = readln().toInt()
    println("Четное ли число: ${factorial(a)}")
}

fun isSimple(num: Int): Boolean {
    if (num in 0..1) return false
    for(i in 1..num-1) {
        if ((i == 1)) continue
        else if (num % i == 0) return false
    }
    return true
}