package Lab8

fun main() {
    print("Prob: ")
    val prob = readln().toInt()
    print("Prize: ")
    val prize = readln().toInt()
    print("Pay: ")
    val pay = readln().toInt()
    println("Объединение: ${comparison(prob, prize, pay)}")
}

fun comparison(prob: Int, prize: Int, pay: Int): Boolean = (prob * prize > pay)