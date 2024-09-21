package Lab5

fun main() {
    println("Введите начальное число")
    var a = readln().toInt()
    println("Введите шаг")
    val step = readln().toInt()
    for (i in a..a+100*step step step){
        print("$i ")
    }
}
