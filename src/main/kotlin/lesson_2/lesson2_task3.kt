package org.example.lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {
    val departureTimeHours: Int = 9
    val departureTimeMinutes: Int = 39
    val timeInWayInMinutes: Int = 457
    val timeInWayHours: Int = timeInWayInMinutes / MINUTES_IN_HOUR
    val timeInWayMinutes: Int = timeInWayInMinutes % MINUTES_IN_HOUR

    val arrivingHours: Int = departureTimeHours + timeInWayHours + ((departureTimeMinutes + timeInWayMinutes) / MINUTES_IN_HOUR)
    val arrivingMinutes: Int = (departureTimeMinutes + timeInWayMinutes) % MINUTES_IN_HOUR

    println("$arrivingHours:$arrivingMinutes")
}