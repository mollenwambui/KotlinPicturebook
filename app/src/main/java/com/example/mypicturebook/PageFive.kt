package com.example.mypicturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PageFive : AppCompatActivity() {
    lateinit var btnLast:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_five)
        btnLast=findViewById(R.id.btnLast)
        btnLast.setOnClickListener {
            val intent=Intent(this,PageFour::class.java)
            startActivity(intent)
        }
    }
}