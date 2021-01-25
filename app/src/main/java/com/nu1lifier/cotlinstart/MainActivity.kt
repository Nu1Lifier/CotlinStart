package com.nu1lifier.cotlinstart

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    private var numberByte: Byte = 5
    private var numberShort:Short = 32
    private var numberInt:Int = 23
    private var numberLong:Long = 32
    private var numberF:Float = 32.21f
    private var numberD:Double = 2.12
    private var text :String = "asdwa"
    private var ch:Char = 'a'
    private var counter:Int = 0
    private var start:Boolean = false

    private var tvText:TextView? = null
    private var cLayout:ConstraintLayout? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvText = findViewById(R.id.tvText)
        cLayout = findViewById(R.id.cLayout)


        Thread{
            start = true
            while (start){
                Thread.sleep(1000)
                   runOnUiThread{
                       if (counter == 5) cLayout?.setBackgroundColor(Color.BLUE)
                       tvText?.setText(counter.toString())
                       counter++
                   }

            }
        }.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        start = false
    }
}