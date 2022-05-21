package com.example.mypicturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Pagethree : AppCompatActivity() {
    lateinit var btnPreviousTwo:Button
    lateinit var btnNextThree:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagethree)
        btnNextThree=findViewById(R.id.btnNextThree)
        btnPreviousTwo=findViewById(R.id.btnPreviousTwo)
        btnPreviousTwo.setOnClickListener {
            val intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
        btnNextThree.setOnClickListener {
            val intent=Intent(this,PageFour::class.java)
            startActivity(intent)
        }
    }
}
