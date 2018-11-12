package com.slatte.vaibhav.slatte.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowManager;

import com.google.android.flexbox.FlexDirection;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.flexbox.JustifyContent;
import com.slatte.vaibhav.slatte.R;
import com.slatte.vaibhav.slatte.adapter.AdapterSelectExpertise;

import java.util.ArrayList;

public class SelectExpertiseActivity extends AppCompatActivity
        implements AdapterSelectExpertise.Interface_AdapterSelectExpertise {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_select_expertise);

        init();
    }

    private RecyclerView rv;
    private ArrayList<String> arr = new ArrayList<>();
    private ArrayList<String> arr_1 = new ArrayList<>();

    private void init(){
        rv = findViewById(R.id.activity_select_expertise_recycler);

//        rv.setLayoutManager(new GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false));

//        rv.setHasFixedSize(true);


        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(getApplicationContext());
        // Set flex direction.
        flexboxLayoutManager.setFlexDirection(FlexDirection.ROW);
        flexboxLayoutManager.setJustifyContent(JustifyContent.FLEX_START);
        rv.setLayoutManager(flexboxLayoutManager);


        arr.clear();
        arr.add("High School");
        arr.add("Engineering");
        arr.add("Medical");
        arr.add("Music");
        arr.add("Swimming");
        arr.add("Pharmacy");
        arr.add("Arts");
        arr.add("Equations");
        arr.add("Vectors");
        arr.add("jazz Blues");
        arr.add("Reggae");
        arr.add("Seasonal");
        arr.add("Country");
        arr.add("Rap");
        arr.add("Punk");
        arr.add("Classic Jazz");
        arr.add("Wedding");
        arr.add("Trance");
        arr.add("Acid Jazz");
        arr.add("Pop");
        arr.add("Electronic");
        arr.add("Soundtracks");

        arr_1.clear();
        arr_1.add("0");
        arr_1.add("0");
        arr_1.add("0");
        arr_1.add("0");
        arr_1.add("0");
        arr_1.add("0");
        arr_1.add("0");
        arr_1.add("0");
        arr_1.add("0");
        arr_1.add("0");
        arr_1.add("0");
        arr_1.add("0");
        arr_1.add("0");
        arr_1.add("0");
        arr_1.add("0");
        arr_1.add("0");
        arr_1.add("0");
        arr_1.add("0");
        arr_1.add("0");
        arr_1.add("0");
        arr_1.add("0");
        arr_1.add("0");


        setMyAdapter();

    }

    private void setMyAdapter(){
        rv.setAdapter(new AdapterSelectExpertise(getApplicationContext(), arr, arr_1,  this));
    }

    public void select_expertise_done(View view){
        finish();
    }

    @Override
    public void method_AdapterSelectExpertise(int position) {

        if(position >=0){
            if(arr_1.get(position).equals("0")){
                arr_1.set(position, "1");
            } else {
                arr_1.set(position, "0");
            }
            setMyAdapter();
        }
    }
}