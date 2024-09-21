package Lab5

fun main(){
    print("Введите количество чисел: ")
    val N = readln().toInt()
    var a = IntArray(N)
    println("Неотсортированный массив: ")
    for (i in 0..N-1){
        a[i] = (10..99).random()
        print("${a[i]} ")
    }
    println("")
    a = bubbleSort(a)
    println("Отсоритрованный массив")
    for (i in a){
        print("$i ")
    }
}

fun bubbleSort(arr: IntArray): IntArray{
    val n = arr.size

    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
    return arr
}