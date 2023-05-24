package lesson_1_10.lesson_6
/*
Задача 2 к Уроку 6
Создай простой таймер, который запрашивает у пользователя количество секунд, которые нужно засечь.
По истечении заданного времени, выведется сообщение в консоли: “Прошло N секунд”. Где N – количество секунд,
введенных пользователем.
 */

const val MILLISECONDS = 1000
fun main() {
    print("Введите количество секунд: >> ")
    val timer = readln().toLong()
    val result = timer * MILLISECONDS
    Thread.sleep(result)
    println("Прошло $timer секунд")
}