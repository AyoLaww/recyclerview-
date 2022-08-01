package com.safari.recyclerview_law

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val mList:List<ItemViewModel>):RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder{
        TODO("Not yet implemented")
        val view = LayoutInflater.from(parent.context).
        inflate(R.layout.card_view_design, parent,false)
        return ViewHolder
    }

    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, postion:Int){
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}