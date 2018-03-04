package com.aliciareesealex.squirrelhack.ui.prev_event_list

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import com.aliciareesealex.squirrelhack.R
import com.aliciareesealex.squirrelhack.model.EventList
import kotlinx.android.synthetic.main.itemview_event.view.*

/**
 * Created by ducot on 3/3/2018.
 */

class PrevEventRecyclerAdapter(val eList: EventList): RecyclerView.Adapter<PrevEventRecyclerAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.plusBtn.setOnClickListener { eList.list[position].increment() }
        holder.plusBtn.setOnClickListener { eList.list[position].decrement() }
    }

    override fun getItemCount(): Int {
        return events.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.itemview_event, parent, false)
        return ViewHolder(v)
    }

    class ViewHolder(itemView: View) {
        val eventName: TextView = itemView.findViewById(R.id.textView_event_name)
        val countValue: TextView = itemView.findViewById(R.id.textView_event_count)
        val plusBtn: ImageButton = itemView.findViewById(R.id.imageButton_plus)
        val minBtn: ImageButton = itemView.findViewById(R.id.imageButton_minus)

    }
}