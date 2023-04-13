package lesson_8

fun main() {
    val arrayIngredients =
        arrayOf("картофель", "сосиски", "помидоры", "сыр", "майонез", "чеснок", "паприка", "соль", "перец")
    
    print("Введите название ингредиента: >> ")
    val userQuestion = readln()
    
    if (userQuestion == arrayIngredients[0] || userQuestion == arrayIngredients[1] ||
        userQuestion == arrayIngredients[2] || userQuestion == arrayIngredients[3] ||
        userQuestion == arrayIngredients[4] || userQuestion == arrayIngredients[5] ||
        userQuestion == arrayIngredients[6] || userQuestion == arrayIngredients[7] ||
        userQuestion == arrayIngredients[8]
    ) {
        println("Ингредиент $userQuestion в рецепте есть")
    } else println("Такого ингредиента в рецепте нет")
}