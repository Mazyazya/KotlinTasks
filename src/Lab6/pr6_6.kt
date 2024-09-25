package Lab6

fun main(){
    print("Введите размер массива: ")
    val n = readln().toInt()
    val arr = IntArray(n)
    print("Массив: ")
    for(i in 0..n-1){
        arr[i] = (1..100).random()
        print("${arr[i]}  ")
    }
    val arr1 = arr.filter { it % 2 != 0 }
    val arr2 = arr.filter { it % 2 == 0 }

    print("\nНечётные элементы: $arr1")
    print("\nЧётные элементы: $arr2")
}