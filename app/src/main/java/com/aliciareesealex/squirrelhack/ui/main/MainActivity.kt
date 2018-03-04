package com.aliciareesealex.squirrelhack.ui.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.aliciareesealex.squirrelhack.R
import com.aliciareesealex.squirrelhack.ui.cur_event_list.CurrEventListFragment
import com.aliciareesealex.squirrelhack.ui.daily_data.DailyDataFragment
import com.google.firebase.analytics.FirebaseAnalytics
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // private lateinit var firebaseAnalyticsService: FirebaseAnalytics
    private lateinit var firebaseAnalyticsService: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)
        initFirebaseStuff()
        setupViewPager()


        /* recyclerView_event_list.setOnClickListener {
             doShit()
         }*/
    }

    private fun setupViewPager() {
        val fragList = listOf(CurrEventListFragment(), DailyDataFragment())
        val pagerAdapter = SquirrelPageAdapter(supportFragmentManager, fragList)
        viewpager_main_page.adapter = pagerAdapter
    }

    private fun initFirebaseStuff() {
        firebaseAnalyticsService = FirebaseAnalytics.getInstance(this)
    }
}

