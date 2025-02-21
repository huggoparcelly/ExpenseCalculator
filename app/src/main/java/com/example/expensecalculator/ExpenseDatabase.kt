package com.example.expensecalculator

object ExpenseDatabase {

    val expenseList = listOf(
        Expense(1, "Pizza", 10.00, "20/02/2025", "Alimentação"),
        Expense(2, "Uber", 25.00, "20/02/2025", "Transporte"),
        Expense(3, "Cinema", 12.00, "10/02/2025", "Lazer"),
        Expense(4, "Livro", 100.00, "10/02/2025", "Outros"),
        Expense(5, "Supermercado", 250.00, "15/02/2025", "Alimentação"),
        Expense(6, "Ônibus", 5.00, "18/02/2025", "Transporte"),
        Expense(7, "Netflix", 45.00, "01/02/2025", "Lazer"),
        Expense(8, "Roupas", 150.00, "12/02/2025", "Outros"),
        Expense(9, "Café", 8.00, "19/02/2025", "Alimentação"),
        Expense(10, "Gasolina", 60.00, "17/02/2025", "Transporte"),
        Expense(11, "Show", 80.00, "05/02/2025", "Lazer"),
        Expense(12, "Celular", 1200.00, "08/02/2025", "Outros"),
        Expense(13, "Farmácia", 35.00, "14/02/2025", "Saúde"),
        Expense(14, "Internet", 99.00, "20/02/2025", "Outros"),
        Expense(15, "Presente", 70.00, "16/02/2025", "Outros")
    )

    fun findAll() = expenseList

    fun findById(id: Int) = expenseList.find { it.id == id }

    fun findByCategory(category: String) = expenseList.filter { it.category == category }

}