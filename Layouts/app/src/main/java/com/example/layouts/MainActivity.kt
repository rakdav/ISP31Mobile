package com.example.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_relaytive)
//        setContentView(R.layout.activity_linear)
//        setContentView(R.layout.activity_table)
        setContentView(R.layout.activity_grid)
    }
}