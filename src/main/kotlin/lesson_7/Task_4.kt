package lesson_7

fun main() {
    print("Введите количество секунд: >> ")
    val time = readln().toInt()
    
    for (i in time downTo 1) {
        println(i)
        Thread.sleep(1000)
    }
    println("Время вышло")
}