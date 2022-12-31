package com.example343443.login

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class Regitr : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regitr)

        supportActionBar!!.setTitle("Registration form")

        var re=findViewById<Button>(R.id.registra)

        re.setOnClickListener{

            Toast.makeText(applicationContext,"Registration", Toast.LENGTH_LONG).show()

        }


        var res=findViewById<Button>(R.id.cencel)

        res.setOnClickListener{

            Toast.makeText(applicationContext,"Cancel",Toast.LENGTH_LONG).show()

        }


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menulogin,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId==R.id.first)
        {
            var preference:SharedPreferences=getSharedPreferences("mypre", Context.MODE_PRIVATE)
            var editor:SharedPreferences.Editor=preference.edit()

            editor.remove("username")
            editor.commit()

            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
            finish()
        }

        return super.onOptionsItemSelected(item)
    }
}