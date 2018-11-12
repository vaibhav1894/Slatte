package com.slatte.vaibhav.slatte.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.slatte.vaibhav.slatte.R;

public class AboutUserActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_about_user);

//        init();
    }

    private TextView tv_add_expertise;
    private void init(){
        tv_add_expertise = findViewById(R.id.activity_about_user_add_expertise);
        tv_add_expertise.setOnClickListener(this);
    }
    public void about_user_next(View view){
        startActivity(new Intent(this, SelectTags.class));
    }

    public void about_user_add_expertise(View view){
        startActivity(new Intent(this, SelectExpertiseActivity.class));
    }

    @Override
    public void onClick(View v) {

    }
}