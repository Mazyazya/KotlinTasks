package Lab7

val spades = Suit("пик")
val clubs = Suit("трефов")
val diamonds = Suit("бубен")
val hearts = Suit("червей")
val deck36 = mutableListOf(spades, clubs, diamonds, hearts)

val player1 = Player()
val player2 = Player()

fun main() {
    println("Игра началась:")
    while (true) {
        player1.giveCard()
        player2.giveCard()

        println()
        println("Ваши карты: ")
        player1.playerCards()

        println("Ваш счет: ")
        println(player1.Score)

        println()
        print("Берем?(да/нет) ")
        if (readln().lowercase() == "нет") break
    }
    println("\nРезультат:\nВаш счет:${player1.Score}\nСчет дилера:${player2.Score}\n")
    when {
        player1.Score > 21 -> println("Вы проиграли")
        player2.Score > 21 -> println("Вы выиграли")
        player1.Score > player2.Score -> println("Вы проиграли")
        player1.Score < player2.Score -> println("Вы выиграли")
        else -> println("Ничья")
    }
}

class Suit(name: String) {
    val suitName = name
    val cards = mutableMapOf<Int, String>(2 to "Валет", 3 to "Дама", 4 to "Король", 7 to "Семерка",
        8 to "Восьмерка", 9 to "Девятка", 10 to "Десятка", 11 to "Туз")

    fun returnCard(): Pair<String?, Int> {
        val score = cards.keys.random()
        val card = cards.get(score)
        cards.remove(score)
        return Pair(card, score)
    }
}

class Player() {
    val cards = mutableListOf<String>()
    var Score: Int = 0
        get() = field
        set(value) {field = value}

    fun giveCard(){
        if (deck36.isEmpty()) {println("Колода закончилась"); return}
        val randSuit = deck36.random()
        val suitName = randSuit.suitName
        val (card, score) = randSuit.returnCard()
        if (randSuit.cards.isEmpty()) deck36.remove(randSuit)
        cards.add(card + " " + suitName)
        Score += score
    }
    fun playerCards(){
        for (card in cards)
            println(card)
    }
}