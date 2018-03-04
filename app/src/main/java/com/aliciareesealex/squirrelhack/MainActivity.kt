package com.aliciareesealex.squirrelhack

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.aliciareesealex.squirrelhack.ui.daily_data.DailyDataFragment
import com.aliciareesealex.squirrelhack.ui.cur_event_list.EventListFragment
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

        val fragList = listOf<Fragment>(EventListFragment(), DailyDataFragment())
        val pagerAdapter = SquirrelPageAdapter(supportFragmentManager, fragList)
        viewpager_main_page.adapter = pagerAdapter


        /* recyclerView_event_list.setOnClickListener {
             doShit()
         }*/
    }
    private fun initFirebaseStuff() {
        firebaseAnalyticsService = FirebaseAnalytics.getInstance(this)
    }
}

