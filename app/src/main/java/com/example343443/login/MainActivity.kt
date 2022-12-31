package com.example343443.login

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.nio.BufferUnderflowException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var uname=findViewById<TextView>(R.id.name)
        var pass=findViewById<TextView>(R.id.pass)
        var butt = findViewById<Button>(R.id.button)
        var r = findViewById<TextView>(R.id.reg)
        var btt2=findViewById<Button>(R.id.button2)

        r.setOnClickListener {
            val intent = Intent(this, Regitr::class.java)
            startActivity(intent)


        }



        butt.setOnClickListener {
            var user = uname.text.toString()
            var pas = pass.text.toString()

            if (user.equals("dj") && pas.equals("dj")) {

                var prefrence:SharedPreferences=getSharedPreferences("mypre", Context.MODE_PRIVATE)
                var editor:SharedPreferences.Editor=prefrence.edit()
                editor.putString("username",user)
                editor.commit()
                val intent = Intent(this, mainhome::class.java)
                startActivity(intent)
                finish()
            }

        }



        btt2.setOnClickListener{

            Toast.makeText(applicationContext,"Cancel",Toast.LENGTH_LONG).show()

        }

    }
}