package org.example.lesson_2

fun main() {
    val buff = 1.2f
    val crystal = 7
    val iron = 11

    val crystalWithBuff = (buff * crystal).toInt()
    val ironWithBuff = (buff * iron).toInt()

    println(crystalWithBuff)
    println(ironWithBuff)
}