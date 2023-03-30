package lesson_4
const val TABLES = 13
fun main (){
    val busyTablesToday = 13
    val busyTablesTomorrow = 9
    println("Доступность столиков на сегодня: ${busyTablesToday < TABLES}\n" +
            "Доступность столиков на завтра: ${busyTablesTomorrow < TABLES}")
}