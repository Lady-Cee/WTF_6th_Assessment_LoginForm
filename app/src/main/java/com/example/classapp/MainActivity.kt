package com.example.classapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //access the button on our UI
        val joinButton: Button = findViewById(R.id.joinNowButton)

        //set a listener to the button
        joinButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)


        }
    }
}