package com.example.radiogroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var radioGroup : RadioGroup?=null
    lateinit var radioButton: RadioButton
    private lateinit var button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Languages"

        radioGroup = findViewById(R.id.radioGroup1)

        button = findViewById(R.id.submitButton)

        button.setOnClickListener{
            val selectedOption:Int = radioGroup!!.checkedRadioButtonId

            radioButton = findViewById(selectedOption)

            Toast.makeText(baseContext,"You Chose "+radioButton.text, Toast.LENGTH_SHORT).show()
        }
    }
}