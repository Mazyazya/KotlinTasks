package Lab6


fun main(){
    print("Введите количество цифр в массиве: ")
    val n = readln().toInt()
    print("Введите шаг прогрессии: ")
    val a = readln().toInt()

    val arr = IntArray(n)
    arr[0] = 0
    for(i in 1..n-1){
        arr[i] = arr[i-1] + a
    }

    println("Массив прогресии: ${arr.joinToString("  ")}")
}