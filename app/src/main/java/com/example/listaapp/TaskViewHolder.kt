package com.example.listaapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TaskViewHolder(view: View): RecyclerView.ViewHolder(view) {
    private val tvTask: TextView = view.findViewById(R.id.tvTask)
    private val tvTaskNumber: TextView = view.findViewById(R.id.tvTaskNumber)

    fun render(task: Task){
        tvTask.text = task.name
        tvTaskNumber.text = task.number
    }
}