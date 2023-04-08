package lesson_5

import java.util.concurrent.ThreadLocalRandom

fun main() {
    val numOne = ThreadLocalRandom.current().nextInt(1,100)
    val numTwo = ThreadLocalRandom.current().nextInt(1,100)
    println("Вам необходимо угадать два числа в диапазоне от 1 до 100")
    print("Введите первое число: ")
    val numberOne = readln().toInt()
    print("Введите второе число: ")
    val numberTwo = readln().toInt()

    if (numberOne == numOne && numberTwo == numTwo) println("Вы выиграли главный приз!")
    else if (numberOne == numOne || numberTwo == numTwo) println("Вы выиграли утешительный приз!")
    else println("Неудача! Крутите барабан!")

    println("Выйгрышные числа: $numOne и $numTwo")
}