package com.cmlabs.ado.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cmlabs.ado.R

class TodoListAdapter():RecyclerView.Adapter<TodoListAdapter.ViewHolder>() {
    class ViewHolder(view: View):RecyclerView.ViewHolder
        (view){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.todos_view,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 20
    }
}