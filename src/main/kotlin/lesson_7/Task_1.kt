package lesson_7
/*
Задача 1 к Уроку 7
Создай программу, которая генерирует шестизначные пароли. Пусть пароль будет состоять из чередующихся
цифр и строчных букв латинского алфавита (без специальных символов). Например, k5p6m2.
 – для каждого символа необходимо создать отдельную переменную;
 – вывести сгенерированный пароль в консоль;
 – подсказка: использовать метод, который может генерировать рандомное число из заданного диапазона.
 */

fun main() {
    val number1: IntRange = 0 until 10
    val symbol1: CharRange = 'a'..'z'
    val number2: IntRange = 0 until 10
    val symbol2: CharRange = 'a'..'z'
    val number3: IntRange = 0 until 10
    val symbol3: CharRange = 'a'..'z'

    print(
        "${number1.random()}${symbol1.random()}" +
                "${number2.random()}${symbol2.random()}" +
                "${number3.random()}${symbol3.random()}"
    )
}