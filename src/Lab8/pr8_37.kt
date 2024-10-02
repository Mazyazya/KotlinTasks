package Lab8

fun main() {
    print("Введите число: ")
    val num = readln().toInt()
    table(num)
}

fun table(num: Int) {
    for(i in 1..10){
        println("$num * $i = ${num * i}")
    }
}