package com.aliciareesealex.squirrelhack

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class SquirrelPageAdapter(val supportFragmentManager: FragmentManager, val fragList: List<Fragment>) : FragmentPagerAdapter(supportFragmentManager) {
    override fun getItem(position: Int): Fragment {
        return fragList[position]
    }

    override fun getCount(): Int {
        return fragList.size
    }
}