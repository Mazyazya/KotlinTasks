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

    val max = arr.max()
    val newArr = del(arr, max)
    val max2 = newArr.max()
    print("\nВторой максимальный элемент: $max2")
}

fun del(arr: IntArray, max: Int): IntArray{
    return arr.filter { it != max }.toIntArray()
}