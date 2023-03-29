package lesson_2

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