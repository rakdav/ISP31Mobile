package com.example.firstandroid22isp31

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    private lateinit var firstNumber:EditText
    private lateinit var secondNumber:EditText
    private lateinit var buttonAdd:Button
    private lateinit var buttonSub:Button
    private lateinit var buttonMult:Button
    private lateinit var buttonDiv:Button
    private lateinit var result:TextView
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstNumber=findViewById(R.id.first)
        secondNumber=findViewById(R.id.second)
        buttonAdd=findViewById(R.id.buttonAdd)
        buttonSub=findViewById(R.id.buttonSub)
        buttonMult=findViewById(R.id.buttonMult)
        buttonDiv=findViewById(R.id.buttonDiv)
        result=findViewById(R.id.result)
        buttonAdd.setOnClickListener {
            var first:Double=firstNumber.text.toString().toDouble()
            var second:Double=secondNumber.text.toString().toDouble()
            result.setText("$first+$second=${first+second}")
        }
        buttonSub.setOnClickListener {
            var first:Double=firstNumber.text.toString().toDouble()
            var second:Double=secondNumber.text.toString().toDouble()
            result.setText("$first-$second=${first-second}")
        }
        buttonMult.setOnClickListener {
            var first:Double=firstNumber.text.toString().toDouble()
            var second:Double=secondNumber.text.toString().toDouble()
            result.setText("$first*$second=${first*second}")
        }
        buttonDiv.setOnClickListener {
            var first:Double=firstNumber.text.toString().toDouble()
            var second:Double=secondNumber.text.toString().toDouble()
            if(second!=0.0)
                result.setText("$first/$second=${first/second}")
            else
            {
                Toast.makeText(applicationContext,resources.getString(R.string.divbyzero),
                    Toast.LENGTH_LONG).show()
                secondNumber.setText("")
            }
        }
    }
}