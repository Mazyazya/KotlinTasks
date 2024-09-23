package Lab6

fun main(){
    val N = 5
    val arr = IntArray(N)
    println("Массив: ")
    for (i in 0..N-1) {
        arr[i] = (1..5).random()
        print("${arr[i]} ")
    }
    println()
    if (isPalindrome(arr)) print("Массив - палиндром")
    else print("Массив не палиндром")
}

fun isPalindrome(arr: IntArray): Boolean{
    for (i in 1..arr.size - 1){
        if (arr[i] != arr.reversed()[i]) return false
    }
    return true
}
