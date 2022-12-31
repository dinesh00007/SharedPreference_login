package com.example343443.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class mainhome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainhome)


        val recyclerViews = findViewById<RecyclerView>(R.id.recycler_view)
        var listofdata = ArrayList<Employee>()

        var data = Employee(R.drawable.javaa,"Java programming")
        var data1 = Employee(R.drawable.cl,"C programming")
        var data2 = Employee(R.drawable.pythons,"Python programming")


        listofdata.add(data)
        listofdata.add(data1)
        listofdata.add(data2)


        var myadpter = CustomAdapter(listofdata, context = applicationContext)

        recyclerViews.adapter=myadpter

        recyclerViews.layoutManager = LinearLayoutManager(this )
        // recyclerViews.layoutManager = LinearLayoutManager(this )

        recyclerViews.setHasFixedSize(true)
    }
}