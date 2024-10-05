package Lab10

fun main(){
    print("Введите строку: ")
    val str = readln()
    println("Введите направление и шаг(\">3\" - вправо на три позиции): ")
    val act = readln().toCharArray()
    print("Зашифрованная строка: ${ceasarCiphler(str, act[0], act[1].toString().toInt())}")
}

fun ceasarCiphler(str: String, act: Char, num: Int): String{
    val chipStr = mutableListOf<Char>()
    var chipChar: Char
    for (i in str){
        if (i == ' ') { chipStr.add(i); continue }
        if (act == '>') chipChar = (i.code + num).toChar()
        else chipChar = (i.code - num).toChar()
        when{
            chipChar.code > 'я'.code -> chipChar = (chipChar.code - ('я'.code - 'А'.code + 1)).toChar()
            chipChar.code < 'А'.code -> chipChar = (chipChar.code + ('я'.code - 'А'.code + 1)).toChar()
        }
        chipStr.add(chipChar)
    }
    return chipStr.joinToString("")
}
