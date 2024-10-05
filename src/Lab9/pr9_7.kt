package Lab9

fun main() {
    println("Введите строку: ")
    val str = readln().toCharArray()
    for(i in 0..str.size - 1){
        if (str[i].isUpperCase()) str[i] = str[i].lowercaseChar()
        else str[i] = str[i].uppercaseChar()
    }
    println(str)
}