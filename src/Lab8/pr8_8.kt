package Lab8

fun main() {
    print("Введите FPS: ")
    val fps = readln().toInt()
    print("Введите количество минут: ")
    val minutes = readln().toInt()
    println("Количество кадров за $minutes минут: ${frames(fps, minutes)}")
}

fun frames(fps: Int, mins: Int): Int = (fps * mins * 60)