package com.aliciareesealex.squirrelhack.ui.prev_event_list

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aliciareesealex.squirrelhack.R
import kotlinx.android.synthetic.main.fragment_prev_event_list.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class EventListFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_event_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setAdapter()
    }

    private fun loadEvents() {
        // idk bro figure it out yourself
    }

    private fun setAdapter() {
        //        Ensures that the actual size of the RView doesn't change
        recyclerView_prev_event_list.hasFixedSize()

        //        Sets # of columns in grid
        val numberOfColumns = 2
        val layoutManager = LinearLayoutManager(context)

        //        Sets recyclerview's layout manager to the one just created
        recyclerView_prev_event_list.layoutManager = layoutManager

        //        Grabs images to be loaded into RecyclerView
        val eventList = loadEvents()

        //        Sets adapter for page
        val prevEventListAdapter = PrevEventRecyclerAdapter(eventList)
        recyclerView_prev_event_list.adapter = prevEventListAdapter
    }


}