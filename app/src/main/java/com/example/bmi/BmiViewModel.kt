package com.example.bmi

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class BmiViewModel: ViewModel() {
    var heightInput by mutableStateOf("")
    var weightInput by mutableStateOf("")


    private var height: Float=0.0f
        get(){
            return heightInput.toFloat()
        }

    private var weight: Float=0.0f
        get(){
            return weightInput.toFloat()
        }

    fun changeHeightInput(value:String){
        heightInput=value
    }
    fun changeWeightInput(value:String){
        weightInput=value
    }

    fun bmi(): Float{
        return if(weight>0 && height>0) weight/(height*height) else 0.0f
    }
}