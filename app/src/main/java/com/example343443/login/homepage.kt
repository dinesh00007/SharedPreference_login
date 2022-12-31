package com.example343443.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        var a = findViewById<Button>(R.id.btnlo)

            a.setOnClickListener {

                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }

    }
}