package com.example.calculatorbarmen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AbsSeekBar
import android.widget.SeekBar
import android.widget.TextView
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class OrderActivity : AppCompatActivity() {
    private lateinit var orderList:TextView
    private lateinit var seek: SeekBar
    private lateinit var tip:TextView
    private lateinit var total:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)
        orderList=findViewById(R.id.orders_list)
        seek=findViewById(R.id.seek)
        tip=findViewById(R.id.tip)
        total=findViewById(R.id.total)
        val arguments:Bundle = intent.extras!!
        if(arguments!=null){
            val listOrders=arguments.getString("orders")!!
            val typeToken = object : TypeToken<List<Food>>() {}.type
            val authors = Gson().fromJson<List<Food>>(listOrders, typeToken)
            var text:String="";
            for(i in authors)
                text+=i.toString()+"\n"
            orderList.setText(text)            
        }

    }
}