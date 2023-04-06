package lesson_5

fun main() {
    val a = 88
    val b = 12
    print("Для входа в приложение решите пример $a + $b = ")
    val result = readln().toInt()
    val resultText = if (a + b == result) "Добро пожаловать!"
    else "Доступ запрещен."

    println(resultText)
}