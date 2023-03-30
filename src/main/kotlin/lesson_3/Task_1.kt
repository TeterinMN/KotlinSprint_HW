package lesson_3

fun main (){
    val textAm = "Доброе утро"
    val textPm = "Добрый вечер"
    val nameUser = "Михаил"
    var result = "$textAm, $nameUser!"

    println(result)
    result = "$textPm, $nameUser!"
    println(result)
}