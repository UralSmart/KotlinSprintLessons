package org.example.lesson_1

import java.util.Formatter

fun main() {
    val secondsTotal: Int = 6360

    val hours: Int = secondsTotal / 3600
    val minutes: Int = (secondsTotal - (3600 * hours)) / 60
    val seconds: Int = secondsTotal - (3600 * hours) - (60 * minutes)

    println(Formatter().format("%1\$02d:%2\$02d:%3\$02d", hours, minutes, seconds).toString())
}