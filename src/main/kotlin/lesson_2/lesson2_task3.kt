package org.example.lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {
    val departureTimeInMinutes: Int = 579
    val timeInWayInMinutes: Int = 457

    val arrivingTimeInMinutes = departureTimeInMinutes + timeInWayInMinutes
    val arrivingHour: Int = arrivingTimeInMinutes / MINUTES_IN_HOUR
    val arrivingMinutes: Int = arrivingTimeInMinutes % MINUTES_IN_HOUR

    val departureTime: String = "$arrivingHour:$arrivingMinutes"

    println(departureTime)
}