package com.example.sierranevadatrailsproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.trails.view.*

class RecyclerAdapterInv(): RecyclerView.Adapter<RecyclerAdapterInv.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapterInv.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.trails, parent, false)

        return ViewHolder(view)
    }

    val inventory = arrayListOf<UserInventory>()

    override fun onBindViewHolder(holder: RecyclerAdapterInv.ViewHolder, pos: Int) {

    }

    override fun getItemCount(): Int {
        return inventory.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }


}