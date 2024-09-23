package Lab6

fun main(){
    val N = 5
    val arr = IntArray(N)
    println("Массив: ")
    for (i in 0..N-1) {
        arr[i] = (1..100).random()
        print("${arr[i]} ")
    }
    println()
    print("Номер первого числа для сменыи: "); val a = readln().toInt()
    print("Номер второго числа для сменыи: "); val b = readln().toInt()
    val c = arr[a]
    arr[a] = arr[b]
    arr[b] = c
    println("Массив: ")
    for (i in arr) {
        print("$i ")
    }
}