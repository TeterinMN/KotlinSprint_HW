package lesson_8
/*
Задача 5 к Уроку 8
Напиши программу, которая должна создавать массив из определенного количества ингредиентов,
которые будет вводить пользователь. Элементы вводятся по одному. Перед вводом элементов сначала
запрашивается количество планируемых ингредиентов.
 */

fun main() {
    print("Введите количество ингредиентов: >> ")
    val arrayQuantity = readln().toInt()
    var arrayIngredients = arrayOf<String>()

    for (i in 0 until arrayQuantity) {
        print("Введите ингредиент: ${i + 1} >> ")
        val temp = readln()
        arrayIngredients += temp
    }
}