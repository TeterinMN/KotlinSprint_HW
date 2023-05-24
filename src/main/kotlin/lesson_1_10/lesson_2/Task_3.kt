package lesson_1_10.lesson_2
/*
Задача 3 к Уроку 2
Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда и время в пути,
а время прибытия вычисляется из них. Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.
 – Создай целочисленные переменные и проинициализируй их этими данными;
 – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 – Выведи результат в консоль.
 */

const val HOUR = 60
fun main() {
    val hours = 9
    val minutes = 39
    val travelTime = 457
    val travelTimeHours = travelTime / HOUR
    val travelTimeMinutes = travelTime % HOUR
    val resultMinutes = (minutes + travelTimeMinutes) % HOUR
    val resultHours = (hours + travelTimeHours) + (minutes + travelTimeMinutes) / HOUR
    println("$resultHours:$resultMinutes")
}