package Lab5

fun main() {
    println("Введите строку")
    val a = readln()
    for(i in (a.length - 1 downTo 0)) {
        print(a[i])
    }
}