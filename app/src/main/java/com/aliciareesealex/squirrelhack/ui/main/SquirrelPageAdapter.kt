package com.aliciareesealex.squirrelhack.ui.main

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.aliciareesealex.squirrelhack.ui.cur_event_list.CurrEventListFragment
import com.aliciareesealex.squirrelhack.ui.daily_data.DailyDataFragment

class SquirrelPageAdapter(private val fragManager: FragmentManager, private val fragList: List<Fragment>) : FragmentStatePagerAdapter(fragManager) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            1 -> DailyDataFragment()
//            2 -> PrevEventListFragment()
            else -> CurrEventListFragment()
        }
//        return fragList[position]
//        return CurrEventListFragment()
    }

    override fun getCount(): Int {
        return fragList.size
    }
}