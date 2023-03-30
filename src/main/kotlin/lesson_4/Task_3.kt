package lesson_4

fun main (){
    val sunnyWeather = true
    val awningOpen = true
    val humidity = 20
    val season = "winter"
    val resultTrue = sunnyWeather && awningOpen && humidity == 20 && season != "winter"
    println("Благоприятные ли условия сейчас для роста бобовых? - $resultTrue")
}