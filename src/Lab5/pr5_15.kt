package Lab5

fun main() {
    println("Введите строку")
    val str = readln()
    val a = str.replace(" ", "").lowercase()
    val b = a.reversed()
    if(isPalindrome(a, b)) println("Строка \"$str\" - палиндром")
    else println("Строка \"$str\" не палиндром")

}

fun isPalindrome(a: String, b: String): Boolean{
    for(i in (1.. a.length-1)) {
        if (a[i] != b[i]) return false
    }
    return true
}