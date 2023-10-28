package com.example.calculatorbarmen

data class Food(val name:String, val count:Int,val price:Double){
    override fun toString(): String {
        return "$name $count $price"
    }
}
