package com.example.mypicturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PageFour : AppCompatActivity() {
    lateinit var btnPreviousFour:Button
    lateinit var btnNextFour:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_four)
        btnNextFour=findViewById(R.id.btnNextFour)
        btnPreviousFour=findViewById(R.id.btnPreviousFour)
        btnPreviousFour.setOnClickListener {
            val intent=Intent(this,Pagethree::class.java)
            startActivity(intent)
        }
        btnNextFour.setOnClickListener {
            val intent=Intent(this, PageFive::class.java)
            startActivity(intent)
        }
    }
}
