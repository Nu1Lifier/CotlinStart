package com.nu1lifier.cotlinstart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {
    var sum : Int = 213 + 214124


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
    fun onClickStart(view: View){
        val intent = Intent(this,SecondActivity::class.java).apply {
            putExtra("salut", "")
            putExtra("salut1", 123+sum)
        }
        startActivity(intent)
    }
}