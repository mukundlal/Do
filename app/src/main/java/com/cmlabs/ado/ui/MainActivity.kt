package com.cmlabs.ado.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cmlabs.ado.R
import com.cmlabs.ado.adapters.TodoListAdapter

class MainActivity : AppCompatActivity() {
    lateinit var todoListAdapter: TodoListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initClass()
    }
    private fun initClass() {
        todoListAdapter=TodoListAdapter()


    }
}