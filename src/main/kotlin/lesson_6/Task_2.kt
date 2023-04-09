package lesson_6

const val MILLISECONDS = 1000
fun main() {
    print("Введите количество секунд: >> ")
    val timer = readln().toLong()
    val result = timer * MILLISECONDS
    Thread.sleep(result)
    println("Прошло $timer секунд")
}