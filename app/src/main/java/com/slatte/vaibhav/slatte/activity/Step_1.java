package com.slatte.vaibhav.slatte.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.WindowManager;

import com.slatte.vaibhav.slatte.R;

public class Step_1 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_step_1);

        init();
    }

    private CardView cardView_educator, cardView_learner;

    private void init(){

        cardView_educator = findViewById(R.id.activity_step_1_card_1);
        cardView_learner = findViewById(R.id.activity_step_1_card_2);

        cardView_educator.setOnClickListener(this);
        cardView_learner.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.activity_step_1_card_1){
            startActivity(new Intent(this, Step_1_User.class).putExtra("type", "educator"));
        } else if(v.getId() == R.id.activity_step_1_card_2){
            startActivity(new Intent(this, Step_1_User.class).putExtra("type", "learner"));
        }

    }
}
