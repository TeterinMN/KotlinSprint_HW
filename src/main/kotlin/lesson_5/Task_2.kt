package lesson_5

const val AGE = 18
const val CURRENT_YEAR = 2023
fun main() {
    print("Введите год Вашего рождения: ")
    val yearOfBirth = readln().toInt()
    val result = if (CURRENT_YEAR - yearOfBirth >= AGE) "Показать экран со скрытым контентом"
    else "Извините, Вы слишком молоды!"

    println(result)
}