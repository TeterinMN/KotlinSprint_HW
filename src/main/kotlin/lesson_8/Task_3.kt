package lesson_8

fun main() {
    val arrayIngredients =
        arrayOf("картофель", "сосиски", "помидоры", "сыр", "майонез", "чеснок", "паприка", "соль", "перец")

    print("Введите название ингредиента: >> ")
    val userQuestion = readln()

    if (userQuestion in arrayIngredients) {
        println("Ингредиент $userQuestion в рецепте есть")
    } else println("Такого ингредиента в рецепте нет")
}