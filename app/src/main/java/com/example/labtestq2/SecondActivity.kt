package com.example.labtestq2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val logout = findViewById<Button>(R.id.btnLogout)
        logout.setOnClickListener(){
           val intent = Intent(this, MainActivity::class.java).apply {            }
           startActivity(intent)
       }
    }
}