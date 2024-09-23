package Lab6

fun main(){
    val N = 10
    val arr = IntArray(N)
    println("Массив: ")
    for (i in 0..N-1) {
        arr[i] = (1..100).random()
        print("${arr[i]} ")
    }
    println("")
    println("Числа Прокопенко: ")
    for (i in arr) {
        if(i % 3 == 0) print("$i ")
    }
}