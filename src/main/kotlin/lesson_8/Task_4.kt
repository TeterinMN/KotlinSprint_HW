package lesson_8

fun main() {
    val arrayIngredients =
        arrayOf("картофель", "сосиски", "помидоры", "сыр", "майонез", "чеснок", "паприка", "соль", "перец")
    for (i in arrayIngredients)
        println("${arrayIngredients.indexOf(i) + 1}. $i")
    
    print("Введите название ингредиента который хотите заменить: >> ")
    val userQuestion = readln()
    
    for (i in arrayIngredients) {
        if (i == userQuestion) {
            print("Какой ингредиент вы хотите добавить? >> ")
            val newIngredient = readln()
            val index = arrayIngredients.indexOf(userQuestion)
            arrayIngredients[index] = newIngredient
            println("Готово! Вы сохранили следующий список:")
            for (j in arrayIngredients) {
                println("${arrayIngredients.indexOf(j) + 1}. $j")
            }
            return
        }
        
    }
    println("Такого ингредиента в рецепте нет")
}