package com.example.listviewproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
//    var countries = arrayOf("Бразилия", "Аргентина", "Колумбия",
//        "Чили", "Уругвай")
    private lateinit var countries:Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        countries=resources.getStringArray(R.array.countries)
        var countriesList:ListView=findViewById(R.id.countriesList)
        var adapter:ArrayAdapter<String> = ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1,
            countries
        )
        countriesList.adapter=adapter
        countriesList.setOnItemClickListener(object: AdapterView.OnItemClickListener{
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Toast.makeText(applicationContext,countries[p2],Toast.LENGTH_LONG).show()
            }

        })
    }
}