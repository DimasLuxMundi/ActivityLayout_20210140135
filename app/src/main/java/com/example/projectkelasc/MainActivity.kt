package com.example.projectkelasc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClick1 = findViewById<Button>(R.id.cons)
        buttonClick1.setOnClickListener{
            val intent = Intent(this, ActConstLayout::class.java)
            startActivity(intent)
        }
        val buttonClick2 = findViewById<Button>(R.id.frame)
        buttonClick2.setOnClickListener {
            val intent = Intent(this, act_framelayout::class.java)
            startActivity(intent)
        }
        val buttonClick3 = findViewById<Button>(R.id.linear)
        buttonClick3.setOnClickListener {
            val intent = Intent(this, act_linear_layout::class.java)
            startActivity(intent)
        }
        val buttonClick4 = findViewById<Button>(R.id.table)
        buttonClick4.setOnClickListener {
            val intent = Intent(this, act_table_layout::class.java)
            startActivity(intent)
        }
    }
}




