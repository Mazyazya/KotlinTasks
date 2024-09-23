package Lab6

fun main(){
    val N = 20
    val arr = IntArray(N)
    println("Массив: ")
    for (i in 0..N-1) {
        arr[i] = (1..100).random()
        if (i % 5 == 0 && i != 0) println("")
        print("${arr[i]} ")
    }
}
