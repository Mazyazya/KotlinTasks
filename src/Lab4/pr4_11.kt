package Lab4


fun main(){
    print("Введите группу крови: ")
    val str = readln()
    when (str.uppercase()) {
        "A" -> println("Для переливания доступна только группа A")
        "B" -> println("Для переливания доступны группы A и B")
        "AB" -> println("Для переливания доступны группы A и AB")
        "O" -> println("Для переливания доступны все группы крови")
    }
}