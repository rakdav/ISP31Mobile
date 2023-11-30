package com.example.firstandroid22isp31

class Calculator
{
    fun Add(x:Double,y:Double):Double{
        return x+y;
    }
    fun Sub(x:Double,y:Double):Double{
        return x-y;
    }
    fun Mault(x:Double,y:Double):Double{
        return x*y;
    }
    fun Div(x:Double,y:Double):Double{
        if(y==0.0) return throw Exception("Делить на ноль нельзя")
        return x/y;
    }
}