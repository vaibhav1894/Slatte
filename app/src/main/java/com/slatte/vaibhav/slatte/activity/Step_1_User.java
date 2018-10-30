
package com.slatte.vaibhav.slatte.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.slatte.vaibhav.slatte.R;

public class Step_1_User extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_step_1__user);

        init();
    }

    private ImageView iv;
    private TextView tv, tv_text_parents;

    private void init(){

        iv = findViewById(R.id.activity_step_1_user_image);
        tv = findViewById(R.id.activity_step_1_user_text);
        tv_text_parents = findViewById(R.id.activity_step_1_text_parents);

        if(getIntent().getExtras() != null){

            String s = getIntent().getExtras().getString("type");

            if(s.equals("educator")){
                iv.setImageResource(R.drawable.ic_educator_1);
                tv.setText("Educator");
                tv_text_parents.setVisibility(View.GONE);
            } else if (s.equals("learner")){
                iv.setImageResource(R.drawable.ic_learner_1);
                tv.setText("Learner");
                tv_text_parents.setVisibility(View.GONE);
            } else {
                iv.setImageResource(R.drawable.ic_parents);
                tv.setText("Parents");
                tv_text_parents.setVisibility(View.VISIBLE);
            }
        }
    }

    public void user_next(View view){

        startActivity(new Intent(this, AboutUserActivity.class));
    }
}
