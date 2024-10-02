package Lab8

fun main() {
    print("Введите пример: ")
    val text = readln()
    println("Результат: ${calc(text)}")
}

fun calc(text: String): Int {
    val numbers = text.split(Regex("[+*/%-]")).map { it.toInt() }
    val actions = text.filter { it in "+*/%-"}.toCharArray()
    var result = numbers[0]
    for (i in 0..<actions.size){
        when (actions[i]) {
            '/' -> result /= numbers[i + 1]
            '*' -> result *= numbers[i + 1]
            '+' -> result += numbers[i + 1]
            '-' -> result -= numbers[i + 1]
            '%' -> result %= numbers[i + 1]
            else -> continue
        }
    }
    return result
}