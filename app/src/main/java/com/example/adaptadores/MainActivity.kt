package com.example.adaptadores

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myList = findViewById<ListView>(R.id.myList)
        var valores = arrayOf("El1","El2","El3","El3","El3","El3","El3","El3","El3","El3","El3","El3","El3")

        val adapter = ArrayAdapter (this, android.R.layout.simple_list_item_1, valores)
        myList.adapter = adapter
    }
}
