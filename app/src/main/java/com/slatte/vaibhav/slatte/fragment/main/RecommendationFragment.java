package com.slatte.vaibhav.slatte.fragment.main;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.slatte.vaibhav.slatte.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecommendationFragment extends Fragment {


    public RecommendationFragment() {
        // Required empty public constructor
    }
//a

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recommendation, container, false);
    }

}
