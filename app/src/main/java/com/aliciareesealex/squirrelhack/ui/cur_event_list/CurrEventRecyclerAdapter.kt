package com.aliciareesealex.squirrelhack.ui.cur_event_list

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import com.aliciareesealex.squirrelhack.R
import com.aliciareesealex.squirrelhack.model.EventList

/**
 * Name: Alex Oladele
 * Unique ID: Oladelaa
 * Date: 3/3/18
 * Project: squirrel
 */
class CurrEventRecyclerAdapter(private val eventList: EventList) : RecyclerView.Adapter<CurrEventRecyclerAdapter.ViewHolder>() {

    //    ======================== MEMBER VARIABLES ========================

    //    ======================== INTERFACE OVERRIDE METHODS ========================
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.itemview_event, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return eventList.size()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.plusButton.setOnClickListener {
            eventList.list[position].increment()
        }

        holder.minusButton.setOnClickListener {
            eventList.list[position].decrement()
        }
    }
    //    ======================== USER METHODS ========================

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val eventName: TextView = itemView.findViewById(R.id.textView_event_name)
        val pointValue: TextView = itemView.findViewById(R.id.textView_event_count)
        val minusButton: ImageButton = itemView.findViewById(R.id.imageButton_minus)
        val plusButton: ImageButton = itemView.findViewById(R.id.imageButton_plus)
    }
}