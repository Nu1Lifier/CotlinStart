package com.nu1lifier.cotlinstart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var number1:Int = 6
    private var number2:Int = 10
    private var text :String = "<1 is here> and <2 is  here> bla bla <3 here> bla bla <4 here> and <5 here>"
    private var phrase1:String = ""
    private var phrase2:String = ""
    private var tvText1:TextView? = null
    private var tvText2:TextView? = null

    //var startNumber = Array(3){""} THIS IS STRING ARRAY
    var startNumber = IntArray(4){5}


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvText1 = findViewById(R.id.tvText1)
        tvText2 = findViewById(R.id.tvText2)
        var tvText2:TextView = findViewById(R.id.tvText2)

        phrase1 = text.substringAfter('<').substringBefore('>')
        phrase2 = text.substringAfter('<').substringAfter('<').substringBefore('>')

        var counter:Int = 0
        for (n in text.indices){
            if (text.get(n) == '<') counter++
        }
        var startPosition = IntArray(counter)
        var endPosition = IntArray(counter)
        var startPcounter:Int = 0
        var endPcounter:Int = 0

        for (n in text.indices){
            if (text.get(n) == '<') {
                startPosition[startPcounter] = n
                startPcounter++
            }

            if (text.get(n) == '>'){
                endPosition[endPcounter] = n
                endPcounter++
            }
        }

        var textFoundArray = Array(counter){""}
        for (n in startPosition.indices){

            textFoundArray[n] = text.substring(startPosition[n]+1, endPosition[n])
            Log.d("MyLog","Text from n: " + textFoundArray[n])
        }

        tvText1?.text = counter.toString()
        tvText2.text = phrase2

    }
}