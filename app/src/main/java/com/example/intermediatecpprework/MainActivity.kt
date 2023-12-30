package com.example.intermediatecpprework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val button: Button get() = findViewById(R.id.button)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{helloToast()}
    }

    private fun helloToast() {
        Toast.makeText(this@MainActivity,"Hello to you too!", Toast.LENGTH_SHORT).show()
    }

}