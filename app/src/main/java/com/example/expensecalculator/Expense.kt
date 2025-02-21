package com.example.expensecalculator

data class Expense(
    val id: Int,
    val description: String,
    val value: Double,
    val date: String,
    val category: String
)
