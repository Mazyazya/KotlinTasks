package Lab6

fun main(){
    val N = 5
    val arr1 = IntArray(N)
    println("Массив 1: ")
    for (i in 0..N-1) {
        arr1[i] = (1..5).random()
        print("${arr1[i]} ")
    }
    println()
    val M = 7
    val arr2 = IntArray(M)
    println("Массив 2: ")
    for (i in 0..M-1) {
        arr2[i] = (1..5).random()
        print("${arr2[i]} ")
    }
    println()
    print("Объединение массивов:\n${arr1.plus(arr2).joinToString()}")
}
