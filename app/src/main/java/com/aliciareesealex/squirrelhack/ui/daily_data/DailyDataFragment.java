package com.aliciareesealex.squirrelhack.ui.daily_data;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aliciareesealex.squirrelhack.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class DailyDataFragment extends Fragment {


    public DailyDataFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_daily_data, container, false);
    }

}
