package lesson_5

const val NUM_ONE = 15
const val NUM_TWO = 66
fun main() {
    println("Вам необходимо угадать два числа в диапазоне от 1 до 100")
    print("Введите первое число: ")
    val numberOne = readln().toInt()
    print("Введите второе число: ")
    val numberTwo = readln().toInt()

    if (numberOne == NUM_ONE && numberTwo == NUM_TWO || numberOne == NUM_TWO && numberTwo == NUM_ONE)
        println("Вы выиграли главный приз!")
    else if (numberOne == NUM_ONE || numberTwo == NUM_TWO) println("Вы выиграли утешительный приз!")
    else println("Неудача! Крутите барабан!")
}