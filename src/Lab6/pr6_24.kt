package Lab6

import kotlin.random.Random

fun main(){
    print("Введите количество строк в матрице: ")
    val N = readln().toInt()
    print("Введите количество столбцов в матрице: ")
    val M = readln().toInt()
    val a =  Array(N, { Array(M, {Random.nextInt(0, 100)}) })
    val b =  Array(M, { Array(N, {0}) })
    println("Массив:")
    printArray(a)
    for (i in 0..N-1)
        for (j in 0..M-1)
            b[j][i] = a[i][j]
    println("Транспонированный массив:")
    printArray(b)
}

fun printArray(arr: Array<Array<Int>>) {
    val n = arr.size
    val m = arr[0].size
    for (i in 0..n-1) {
        for (j in 0..m-1)
            print("${arr[i][j]} ")
        println("")
    }
}