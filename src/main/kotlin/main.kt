package ru.netology

fun main() {
    var amount = 7000
    val fee = 0.75 / 100
    val minFee = 35

    var totalFee = amount * fee
    if (totalFee <= minFee) totalFee = minFee.toDouble()
    println(totalFee)
}