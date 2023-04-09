package lesson_5

import kotlin.random.Random

fun main() {
    val numOne = Random.nextInt(1, 101)
    val numTwo = Random.nextInt(1, 101)
    println("Вам необходимо угадать два числа в диапазоне от 1 до 100")
    print("Введите первое число: ")
    val numberOne = readln().toInt()
    print("Введите второе число: ")
    val numberTwo = readln().toInt()

    if (numberOne == numOne && numberTwo == numTwo || numberTwo == numOne && numberOne == numTwo)
        println("Вы выиграли главный приз!")
    else if (numberOne == numOne || numberTwo == numTwo && numberTwo == numOne || numberOne == numTwo)
        println("Вы выиграли утешительный приз!")
    else println("Неудача! Крутите барабан!")

    println("Выйгрышные числа: $numOne и $numTwo")
}