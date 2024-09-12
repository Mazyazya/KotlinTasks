fun main(){
    println("Enter a number: ")
    val a = readln().toDouble()
    val b = readln().toDouble()

    if (a > b) println("$a больше $b")
    else println("$a меньше $b")
}