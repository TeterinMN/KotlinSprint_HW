package lesson_6

fun main() {
    print("Введите количество секунд: >> ")
    var timer = readln().toLong()
    while (timer > 0) {
        Thread.sleep(1000)
        println("Осталось секунд: $timer")
        timer--
    }
    println()
    println("Время вышло")
}