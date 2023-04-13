package lesson_8

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