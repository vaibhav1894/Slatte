package com.slatte.vaibhav.slatte.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import com.slatte.vaibhav.slatte.R;
import com.slatte.vaibhav.slatte.helper.Constant;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        init();

/*        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_in_bottom);
        imgSplash.startAnimation(animation);
        imgLogo.startAnimation(animationLogo);*/


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splash.this, Step_1.class));
                finish();
            }
        }, Constant.SPLASH_TIME_OUT);
    }

    private LinearLayout iv;

    private void init(){

        iv = findViewById(R.id.splash_logo);

        Animation animationLogo = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.splash_fade_out);
        iv.startAnimation(animationLogo);

    }
}
