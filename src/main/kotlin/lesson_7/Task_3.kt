package lesson_7

fun main() {
    print("Введите число: >> ")
    val number = readln().toInt()
    val range: IntProgression = 0..number step 2
    for (i in range) print("$i, ")
}