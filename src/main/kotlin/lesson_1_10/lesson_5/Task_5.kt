package lesson_1_10.lesson_5
/*
Задача 5* к Уроку 5
Для алгоритма улучшенного приложения-лотереи, нужно угадать два числа от 1 до 100.
Если угадать только одно – игрок получает утешительный приз.
Напиши программу, проверяющую выигрыш. Пользователь должен вводить числа в консоль.
Выйгрышные числа должны меняться при каждом запуске (то есть не должны быть проинициализированы заранее, как в задаче 3).
Точно также надо оформить ввод чисел подсказками, в конце распечатать выйгрышные числа.
 */

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