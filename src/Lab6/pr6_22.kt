package Lab6

fun main(){
    print("Введите размер массива: ")
    val n = readln().toInt()
    var arr = IntArray(n)
    print("Массив: ")
    for(i in 0..n-1){
        arr[i] = (1..100).random()
        print("${arr[i]}  ")
    }
    val newArr = arr.filter { it != arr.max() }.toIntArray()
    print("\nВторой максимальный элемент: ${newArr.max()}")
}