package Lab6

fun main(){
    var arr = IntArray(6)
    val arr1 = arrRand(arr)
    println("Массив №1")
    print(arr1.joinToString(" | "))

    val arr2 = arrRand(arr)
    println("\nМассив №2")
    print(arr2.joinToString(" | "))

    val arr3 = arrRand(arr)
    println("\nМассив №3")
    print(arr3.joinToString(" | "))

    val arr123 = arr1 + arr2 + arr3
    println("\nИтоговый массив: \n${arr123.joinToString(" | ")}")
}

fun arrRand(arr: IntArray): IntArray{
    for(i in 0..5){
        arr[i] = (10..99).random()
    }
    return arr
}
