package lesson_8

fun main() {
    val arrayViews = arrayOf(35, 55, 78, 12, 33, 56, 82)
    var resultViews = 0

    for (i in arrayViews) resultViews += i
    println(resultViews)
}