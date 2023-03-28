package lesson_1

fun main (){
    var orderNumber = 75
    val gratitudeText = "Спасибо за покупки в нашем интернет магазине!"
    println("Заказ №$orderNumber, $gratitudeText")

    var workers = 2000
//    println("В нашем интернет магазине работает $workers работников!")
    workers = 1999
    println("Из нашего интернет магазина один работник уволился, осталось $workers работников!")
}