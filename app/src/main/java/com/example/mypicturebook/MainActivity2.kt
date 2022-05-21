package com.example.mypicturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    lateinit var btnPreviousOne:Button
    lateinit var btnNextTwo:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btnPreviousOne=findViewById(R.id.btnPreviousOne)
        btnNextTwo=findViewById(R.id.btnNextTwo)
        btnPreviousOne.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btnNextTwo.setOnClickListener {
            val intent=Intent(this,Pagethree::class.java)
            startActivity(intent)
        }
    }
}