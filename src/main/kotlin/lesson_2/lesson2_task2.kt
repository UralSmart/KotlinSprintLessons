package org.example.lesson_2

fun main() {
    val employeesCount = 50
    val employeeSalary = 30000
    val internsCount = 30
    val internSalary = 20000

    val employeesTotalBudget = employeesCount * employeeSalary
    val totalBudget = employeesTotalBudget + (internsCount * internSalary)
    val averageSalary = totalBudget / (employeesCount + internsCount)

    println(employeesTotalBudget)
    println(totalBudget)
    println(averageSalary)
}