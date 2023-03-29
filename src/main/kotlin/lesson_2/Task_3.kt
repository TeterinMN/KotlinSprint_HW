package lesson_2

fun main(){
    val hours = 9
    val minutes = 39
    val travelTime = 457
    val travelTimeHours = travelTime / 60
    val travelTimeMinutes = travelTime % 60
    val resultMinutes = (minutes + travelTimeMinutes) % 60
    val resultHours = (hours + travelTimeHours) + (minutes + travelTimeMinutes) / 60

            println("$resultHours:$resultMinutes")
}