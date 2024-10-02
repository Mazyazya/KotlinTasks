package Lab8

fun main() {
    print("Введите размер массива: ")
    val n = readln().toInt()
    println("Последовательность: ${randArr(n).joinToString(" ")}")
}

fun randArr(n: Int): IntArray{
    val arr = IntArray(n)
    for(i in 1..n) {
       arr[i - 1] = i
    }
    return arr
}