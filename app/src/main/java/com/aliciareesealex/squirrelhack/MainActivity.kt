package com.aliciareesealex.squirrelhack

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.firebase.analytics.FirebaseAnalytics

class MainActivity : AppCompatActivity() {
    // private lateinit var firebaseAnalyticsService: FirebaseAnalytics
    private lateinit var firebaseAnalyticsService: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)
        initFirebaseStuff()
       /* recyclerView_event_list.setOnClickListener {
            doShit()
        }*/
    }

    private fun initFirebaseStuff() {
        firebaseAnalyticsService = FirebaseAnalytics.getInstance(this)

    }
}

