package com.example.expensecalculator

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import java.text.DecimalFormat

class ExpenseAdapter(private val expenseList: List<Expense>): Adapter<ExpenseAdapter.ExpenseViewHolder>() {

    class ExpenseViewHolder(view: View): ViewHolder(view) {
        val context: Context = view.context
        val expenseValue: TextView = view.findViewById(R.id.expense_value)
        val expenseCategory: TextView = view.findViewById(R.id.expense_category)
        val expenseDate: TextView = view.findViewById(R.id.expense_date)
        val expenseDescription: TextView = view.findViewById(R.id.expense_description)
        val expenseColor: View = view.findViewById(R.id.expense_color)

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ExpenseViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_expense, parent, false)

        return ExpenseViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ExpenseViewHolder,
        position: Int
    ) {
        val df = DecimalFormat("0.00")
        holder.expenseValue.text = "R$ ${df.format(expenseList[position].value).toString().replace(".", ",")}"
        holder.expenseCategory.text = expenseList[position].category
        holder.expenseDate.text = expenseList[position].date
        holder.expenseDescription.text = expenseList[position].description

        when(expenseList[position].category) {
            "Alimentação" -> holder.expenseColor.setBackgroundColor(holder.context.getColor(R.color.food_color))
            "Transporte" -> holder.expenseColor.setBackgroundColor(holder.context.getColor(R.color.transport_color))
            "Lazer" -> holder.expenseColor.setBackgroundColor(holder.context.getColor(R.color.leisure_color))
            "Saúde" -> holder.expenseColor.setBackgroundColor(holder.context.getColor(R.color.heath_color))
            "Outros" -> holder.expenseColor.setBackgroundColor(holder.context.getColor(R.color.other_color))
        }
    }
    override fun getItemCount(): Int = expenseList.size

}