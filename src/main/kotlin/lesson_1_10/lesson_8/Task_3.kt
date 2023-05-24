package lesson_1_10.lesson_8
/*
Задача 3 к Уроку 8
Скопируй предыдущее задание. Нужно изменить код, чтобы проверить, есть ли ингредиент в рецепте,
но не используя циклы для поиска.
 */

fun main() {
    val arrayIngredients =
        arrayOf("картофель", "сосиски", "помидоры", "сыр", "майонез", "чеснок", "паприка", "соль", "перец")

    print("Введите название ингредиента: >> ")
    val userQuestion = readln()

    if (userQuestion in arrayIngredients) {
        println("Ингредиент $userQuestion в рецепте есть")
    } else println("Такого ингредиента в рецепте нет")
}