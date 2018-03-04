package com.aliciareesealex.squirrelhack.ui.cur_event_list


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aliciareesealex.squirrelhack.R
import com.aliciareesealex.squirrelhack.model.EventList
import com.aliciareesealex.squirrelhack.model.TemplateEvent
import kotlinx.android.synthetic.main.fragment_event_list.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class CurrEventListFragment : Fragment() {
    private val eList = loadEvents()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_event_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
        updateTextVIew()
        setAdapter()
    }

    private fun updateTextVIew() {
//        val timer = Timer()
//        timer.schedule(2000)
        // start some dummy thread that is different from UI thread
        Thread(Runnable {
            // performing some dummy time taking operation
//            var i=0;
//            while(i<Int.MAX_VALUE){
//                i++
//            }
            val isInterrupted = false
            while (!isInterrupted) {
                Thread.sleep(1000)
                activity?.runOnUiThread(java.lang.Runnable {
                    textView_total_num.text = eList.total().toString()
                })
            }
//
//            // try to touch View of UI thread
//            activity?.runOnUiThread(java.lang.Runnable {
//                textView_total_num.text = eList.total().toString()
//            })
        }).start()
    }


    private fun setAdapter() {
//        Ensures that the actual size of the RView doesn't change
//        recyclerView_event_list.hasFixedSize()
        val layoutManager = LinearLayoutManager(context)

//        Sets recyclerview's layout manager to the one just created
        recyclerView_event_list.layoutManager = layoutManager

//        Grabs images to be loaded into RecyclerView
        val eventsList = eList

//        Sets adapter for page
        val eventlistAdapter = CurrEventRecyclerAdapter(eventsList)
        recyclerView_event_list.adapter = eventlistAdapter
    }

    private fun loadEvents(): EventList {
        val genericEventList = EventList()
        for (item in TemplateEvent.templates) {
            genericEventList.addEvent(item)
        }
        return genericEventList
    }


}
