package lesson_9
/*
Задача 5 к Уроку 9
Напиши программу, которая запрашивает у пользователя пять названий ингредиентов (каждый по отдельности).
 – результат должен исключать повторы;
 – список должен выводиться в алфавитном порядке;
 – все элементы списка выведены в одну строку, разделяя слова запятыми;
 – первое слово должно быть напечатано с заглавной буквы, в конце списка должна стоять точка.
 */

fun main() {
    val listIngredients = mutableSetOf<String>()

    while (listIngredients.size < 5) {
        print("Введите название ингредиента: ")
        val ingredient = readln()
        if (ingredient.isNotEmpty()) {
            listIngredients.add(ingredient)
        }
    }
    val listSorted = listIngredients.sorted().map { it.replaceFirstChar { it.uppercase() } }
    val result = listSorted.joinToString(", ")
    print("$result.")
}