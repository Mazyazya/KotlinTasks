package Lab5

fun main() {
    println("Введите число")
    val N = readln().toInt()
    println("Число фибоначчи под номером $N = ${fibonacсi(N-2)}")
}

fun fibonacсi(N: Int): Int{
    var a = 1; var b = 1
    var c = 1
    for(i in 1..N) {
        c = a + b
        a = b
        b = c
    }
    return c
}