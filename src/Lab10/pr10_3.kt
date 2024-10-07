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
    val charList = ('А'..'Е') + 'Ё' + ('Ж'..'Я') + ('а'..'е') + 'ё' + ('ж'..'я')
    for (i in str) {
        if (i == ' ') {chipStr.add(i); continue}
        if (act == '>')
            when {
                charList.indexOf(i) + num >= charList.size -> chipChar = charList[charList.indexOf(i) + num - 66]
                else -> chipChar = charList[charList.indexOf(i) + num]
            }
        else
            when {
                charList.indexOf(i) - num < 0 -> chipChar = charList[charList.indexOf(i) - num + 66]
                else -> chipChar = charList[charList.indexOf(i) - num]
            }
        chipStr.add(chipChar)
    }
    return chipStr.joinToString("")
}
