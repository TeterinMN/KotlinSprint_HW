package lesson_8
/*
Задача 4 к Уроку 8
Представим, что мы получили массив ингредиентов. Программа должна распечатать весь список ингредиентов,
затем заменить нужный ингредиент на новый по желанию пользователя. После этого программа
должна показать обновленный список.
 – создай массив со списком ингредиентов и напечатай его в консоль;
 – запроси у пользователя информацию об ингредиенте, который он хочет заменить;
 – если пользователь ввел ингредиент, которого нет в списке, вывести соответствующее сообщение;
 – если есть, запроси ингредиент, который пользователь хотел бы добавить;
 – выведи обновленный список с сообщением: “Готово! Вы сохранили следующий список: [список_ингредиентов]”.
 */

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