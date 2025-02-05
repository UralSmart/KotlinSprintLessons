package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val startDeposit = 70_000.000f
    val interestRate = 1.167f
    val depositTime = 20
    val daysInYear = 365.25f

    var result = startDeposit * interestRate
    for(i in 2..depositTime) {
        result *= interestRate
    }
    println("%.3f".format(result))

    val result2 = (startDeposit * (1 * interestRate * daysInYear / daysInYear * 1).pow(depositTime))
    println("%.3f".format(result2))
}