package com.abdurrahman.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abdurrahman.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.plusButton.setOnClickListener{
            performPlus()
        }
        binding.minusButton.setOnClickListener{
            performSub()
        }
        binding.multButton.setOnClickListener{
            performMult()
        }
        binding.divideButton.setOnClickListener{
            performDivide()
        }


    }
    private  fun performPlus(){
        val number1 = binding.input1.text.toString().toDouble()
        val number2 = binding.input2.text.toString().toDouble()
        val result = number1 + number2

        binding.result.text = result.toString()
    }
    private  fun performSub(){
        val number1 = binding.input1.text.toString().toDouble()
        val number2 = binding.input2.text.toString().toDouble()
        val result = number1 - number2

        binding.result.text = result.toString()
    }
    private  fun performMult(){
        val number1 = binding.input1.text.toString().toDouble()
        val number2 = binding.input2.text.toString().toDouble()
        val result = number1 * number2

        binding.result.text = result.toString()
    }
    private  fun performDivide(){
        val number1 = binding.input1.text.toString().toDouble()
        val number2 = binding.input2.text.toString().toDouble()
        val result = number1 / number2

        val formattedResult = String.format("%.5f", result)
        binding.result.text = formattedResult
    }

}