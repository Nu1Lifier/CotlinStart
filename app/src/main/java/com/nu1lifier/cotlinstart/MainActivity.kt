package com.nu1lifier.cotlinstart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var number1:Int = 6
    private var number2:Int = 10
    private var text :String = "<1 is here> and <2 is  here>"
    private var phrase1:String = ""
    private var phrase2:String = ""
    private var tvText1:TextView? = null
    private var tvText2:TextView? = null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvText1 = findViewById(R.id.tvText1)
        tvText2 = findViewById(R.id.tvText2)
        var tvText2:TextView = findViewById(R.id.tvText2)

        phrase1 = text.substringAfter('<').substringBefore('>')
        phrase2 = text.substringAfter('<').substringAfter('<').substringBefore('>')


        tvText1?.setText(phrase1)
        tvText2.setText(phrase2)



    }
}