package org.example.lesson_1

const val SECONDS_IN_MINUTE = 60

fun main() {
    val secondsTotal: Int = 6360

    val hours: Int = secondsTotal / 3600
    val minutes: Int = (secondsTotal - ((SECONDS_IN_MINUTE * SECONDS_IN_MINUTE) * hours)) / SECONDS_IN_MINUTE
    val seconds: Int = secondsTotal - ((SECONDS_IN_MINUTE * SECONDS_IN_MINUTE) * hours) - (SECONDS_IN_MINUTE * minutes)

    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}