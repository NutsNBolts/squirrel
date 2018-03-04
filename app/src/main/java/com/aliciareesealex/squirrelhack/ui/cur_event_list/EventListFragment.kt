package com.aliciareesealex.squirrelhack.ui.cur_event_list


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aliciareesealex.squirrelhack.R


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

        //        Ensures that the actual size of the RView doesn't change
        recyclerView_explore_images.hasFixedSize()

        //        Sets # of columns in grid
        val numberOfColumns = 2
        val layoutManager = GridLayoutManager(context, numberOfColumns)

        //        Sets recyclerview's layout manager to the one just created
        recyclerView_explore_images.layoutManager = layoutManager

        //        Grabs images to be loaded into RecyclerView
        val urlList = presenter.loadImages()

        //        Sets adapter for page
        val homepageAdapter = HomepageRecyclerAdapter(urlList)
        recyclerView_explore_images.adapter = homepageAdapter
    }


}
