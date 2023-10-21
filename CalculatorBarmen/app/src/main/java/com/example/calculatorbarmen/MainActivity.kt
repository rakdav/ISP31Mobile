package com.example.calculatorbarmen

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import androidx.cardview.widget.CardView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var TableName:EditText
    private lateinit var Orders:LinearLayout
    private lateinit var fab:FloatingActionButton
    private lateinit var button: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TableName=findViewById(R.id.tableNumber)
        Orders=findViewById(R.id.orders)
        fab=findViewById(R.id.fabOk)
        button=findViewById(R.id.OK)
        fab.setOnClickListener{

        }

    }
}