package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstNumber = findViewById<EditText>(R.id.num1)
        val secondNumber = findViewById<EditText>(R.id.num2)

        val sumButton = findViewById<RadioButton>(R.id.buttonSum)
        val diffButton = findViewById<RadioButton>(R.id.buttonDiff)
        val multiButton = findViewById<RadioButton>(R.id.buttonProduct)
        val divButton = findViewById<RadioButton>(R.id.buttondivide)

        val resultText = findViewById<TextView>(R.id.tv_Result)

        //val submitButton = findViewById<Button>(R.id.bSubmit)
        val submitButton = findViewById<Button>(R.id.buttonsubmit)
        submitButton.setOnClickListener{
            val num1 = firstNumber.text.toString().toDouble()
            val num2 = secondNumber.text.toString().toDouble()

            if (sumButton.isChecked){
                val res = num1 + num2
                val message= "Sum = $res"
                resultText.text = message
            }
            else if (diffButton.isChecked){
                val res = num1 - num2
                val message= "Difference = $res"
                resultText.text = message
            }
            else if (multiButton.isChecked){
                val res = num1 * num2
                val message= "Product = $res"
                resultText.text = message
            }
            else if (divButton.isChecked){
                val res = num1/num2
                val message= "Quotient = $res"
                resultText.text = message
            }
            else {
                Toast.makeText( this@MainActivity, "Enter proper values", Toast.LENGTH_SHORT).show()
            }

        }


    }
}