package Lab6

fun main(){
    print("Введите размер массива: ")
    val n = readln().toInt()
    val arr = IntArray(n)
    print("Массив: ")
    for(i in 0..n-1){
        arr[i] = (1..10).random()
        print("${arr[i]}  ")
    }
    print("\nУникальные элементы: ${arr.groupBy {it}.filter { it.value.size == 1 }.keys}")
}


