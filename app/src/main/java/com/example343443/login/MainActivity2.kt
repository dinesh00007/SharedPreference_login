package com.example343443.login

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {

    lateinit var imag:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        imag=findViewById(R.id.image1)

        imag.alpha = 0f
        imag.animate().setDuration(1500).alpha(1f).withEndAction {
            var preferences:SharedPreferences=getSharedPreferences("mypre", Context.MODE_PRIVATE)
            var uname=preferences.getString("username","no")
            if (uname.equals("dj")){

                var intent: Intent = Intent(applicationContext, mainhome::class.java)
                startActivity(intent)
                finish()
            }
            else
            {
                var intent: Intent = Intent(applicationContext, MainActivity::class.java)
                startActivity(intent)
                finish()
            }

            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()

        }
    }
}