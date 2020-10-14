package com.example.provaintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.bt)

        button.setOnClickListener(){
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("dataClick", Date().toString())
            startActivity(intent)
        }
    }
}