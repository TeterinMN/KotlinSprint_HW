package lesson_1
/*
Задача 2 к Уроку 1
Скопируй решение из задачи 1 в новый файл с задачей 2. Теперь необходимо дописать реализацию
программы для новых целей. Имитируем логи с сервера.
 – Для начала выведи в консоль значения всех объявленных ранее переменных;
 – Далее нужно сделать так, чтобы программа хранила количество работников данного интернет-магазина (2000).
 Подбери подходящее наименование переменной, присвой ей значение и распечатай;
 – Далее представим, что один работник уволился. Закомментируй предыдущий код с распечаткой количества
 работников, присвой новое значение количества работников этой переменной и распечатай в консоль.
Оценивается не только правильная последовательность действий, но и грамотная организация кода
(порядок объявления, отступы и так далее).
 */

fun main (){
    var orderNumber = 75
    val gratitudeText = "Спасибо за покупки в нашем интернет магазине!"
    println("Заказ №$orderNumber, $gratitudeText")

    var workers = 2000
//    println("В нашем интернет магазине работает $workers работников!")
    workers = 1999
    println("Из нашего интернет магазина один работник уволился, осталось $workers работников!")
}