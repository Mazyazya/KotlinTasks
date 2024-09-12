package Lab4

fun main(){
    print("Введите блюдо: ")
    val str = readln()
    when (str.lowercase()) {
        "яичница" -> println("5 минут")
        "макароны" -> println("7 минут")
        "пельмени" -> println("15 минут")
    }
}