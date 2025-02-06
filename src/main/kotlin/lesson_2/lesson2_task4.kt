package org.example.lesson_2

fun main() {
    val buff = 20
    val crystal = 7f
    val iron = 11f

    val crystalWithBuff = (crystal / 100 * (100 + buff)).toInt()
    val ironWithBuff = (iron / 100 * (100 + buff)).toInt()

    println(crystalWithBuff)
    println(ironWithBuff)
}