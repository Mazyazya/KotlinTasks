package Lab5

fun main() {
    print("Введите N: ")
    val number = readln().toInt()
    for (i in 1..number){
        print(" ".repeat(number-i))
        for (j in 1..i) {
            print("$i")
            print(" ".repeat(number.toString().length-(i.toString().length-1)))
        }
        println("")
    }
}