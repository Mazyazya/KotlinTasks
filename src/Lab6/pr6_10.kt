package Lab6

fun main(){
    val N = 5
    val arr = IntArray(N)
    var evenSum = 0
    println("Массив: ")
    for (i in 0..N-1) {
        arr[i] = (1..100).random()
        print("${arr[i]} ")
    }
    println("")
    for (i in arr) {
        if (i % 2 == 0) evenSum += i
    }
    println("Сумма четных чисел массива = ${evenSum}: ")
}