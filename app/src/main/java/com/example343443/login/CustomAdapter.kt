package com.example343443.login

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList
import androidx.recyclerview.widget.RecyclerView.ViewHolder as RecyclerViewViewHolder

class CustomAdapter(
    var list: ArrayList<Employee>, val context: Context
): RecyclerView.Adapter<CustomAdapter.CustomViewHolder>()

{


  class CustomViewHolder(itemView: View): RecyclerViewViewHolder(itemView)
  {

      var header:ImageView=itemView.findViewById(R.id.imageView)

      var itemtital:TextView=itemView.findViewById(R.id.text)
     // var itemdesc:TextView=itemView.findViewById(R.id.text2)

  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.CustomViewHolder {

      val v =LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)

      return CustomViewHolder(v)

  }


  override fun getItemCount(): Int {
      return list.size
  }


  override fun onBindViewHolder(holder: CustomAdapter.CustomViewHolder, position: Int) {




    //  holder.header.setImageResource(list[position].img)



    /*  Glide.with(context)  //2
          .load(list[position].img) //3
          .centerCrop() //4
          .placeholder(R.drawable.lodings) //5
          .error(R.drawable.errors) //6
          .fallback(R.drawable.cl) //7
          .into(holder.header)*/
      holder.itemtital.text=list[position].name


          //holder.itemdesc.text=desc[position]

          holder.itemView.setOnClickListener {

             // Toast.makeText(context,"${}",Toast.LENGTH_LONG).show()

            }

  }

}