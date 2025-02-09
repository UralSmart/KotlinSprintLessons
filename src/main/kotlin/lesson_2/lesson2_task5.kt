package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val startDeposit = 70_000.0
    val interestRate = 16.7
    val depositTime = 20

    val rateInDec = interestRate / 100.0

    val result = startDeposit * Math.pow(1.0 + rateInDec, depositTime.toDouble())
    println("%.3f".format(result))
}