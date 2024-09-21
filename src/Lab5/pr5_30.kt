package Lab5

fun main() {
    println("Введите целое число:")
    val number = readln().toInt()
    var temp = number
    var bin: String = ""
    while(temp > 0) {
        bin += (temp % 2).toString()
        temp /= 2
    }
    println("Двоичное представление числа $number: $bin")
}