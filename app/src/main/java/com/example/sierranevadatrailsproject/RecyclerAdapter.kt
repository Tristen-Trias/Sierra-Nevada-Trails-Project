package com.example.sierranevadatrailsproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.trails.view.*

class RecyclerAdapter(): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.trails, parent, false)

        return ViewHolder(view)
    }

    val trail = arrayListOf<Trail>()

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, pos: Int) {
        val trail : Trail = trail[pos]
        holder.itemImage.setImageResource(R.drawable.ic_launcher_background)
        holder.trailName.text = trail.t_name
        holder.trailLength.text = trail.t_length.toString()
        holder.trailDesc.text = trail.t_information
    }

    override fun getItemCount(): Int {
        return trail.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemImage = itemView.item_image
        var trailName = itemView.item_name
        var trailLength = itemView.item_qty_length
        var trailDesc = itemView.item_desc
    }

}