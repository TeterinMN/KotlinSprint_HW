package lesson_8
/*
Задача 2 к Уроку 8
Представь, что ты работаешь над приложением с рецептами. Напиши код, который проверяет,
есть ли нужный ингредиент в рецепте.
 – создай массив, в котором будет храниться список ингредиентов для определенного блюда;
 – далее через консоль запроси у пользователя информацию об ингредиенте, который он хочет найти;
 – произвести поиск элемента по массиву, используя цикл for;
 – если ингредиент в списке есть, выведи в консоль сообщение - “Ингредиент     [название] в рецепте есть”;
 – если нет, сообщать: “Такого ингредиента в рецепте нет”.
 */

fun main() {
    val arrayIngredients =
        arrayOf("картофель", "сосиски", "помидоры", "сыр", "майонез", "чеснок", "паприка", "соль", "перец")
    
    print("Введите название ингредиента: >> ")
    val userQuestion = readln()
    
    for (i in arrayIngredients) {
        if (i == userQuestion) {
            println("Ингредиент $i в рецепте есть")
            return
        }
        
    }
    println("Такого ингредиента в рецепте нет")
}