package com.slatte.vaibhav.slatte.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.slatte.vaibhav.slatte.R;
import com.slatte.vaibhav.slatte.helper.Utils;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

//        Utils.hideSoftKeyboard(LoginActivity.this);

        init();
    }

    private EditText edt_signin_email, edt_signin_password,
    edt_signup_email, edt_signup_password, edt_signup_confirm_password;
    private TextView tv_signin, tv_signup;
    private LinearLayout layout_signup, layout_signin;

    private void init(){
        edt_signup_email = findViewById(R.id.activity_login_signup_edt_email);
        edt_signup_password = findViewById(R.id.activity_login_signup_edt_password);
        edt_signup_confirm_password = findViewById(R.id.activity_login_signup_edt_conirm_password);

        edt_signin_email = findViewById(R.id.activity_login_signin_edt_email);
        edt_signin_password = findViewById(R.id.activity_login_signin_edt_password);

        tv_signin = findViewById(R.id.activity_login_btn_signin);
        tv_signup = findViewById(R.id.activity_login_btn_signup);

        layout_signin = findViewById(R.id.activity_login_layout_signin);
        layout_signup = findViewById(R.id.activity_login_layout_signup);
    }

    public void signin(View view){
        tv_signin.setBackgroundDrawable(getResources().getDrawable(R.drawable.shape_background_button_2));
        tv_signup.setBackgroundDrawable(getResources().getDrawable(R.drawable.shape_border_button_2));
        layout_signin.setVisibility(View.VISIBLE);
        layout_signup.setVisibility(View.GONE);
    }

    public void signup(View view) {
        tv_signup.setBackgroundDrawable(getResources().getDrawable(R.drawable.shape_background_button_2));
        tv_signin.setBackgroundDrawable(getResources().getDrawable(R.drawable.shape_border_button_2));
        layout_signup.setVisibility(View.VISIBLE);
        layout_signin.setVisibility(View.GONE);
    }

    public void login(View view){
        if(!edt_signin_email.getText().toString().trim().isEmpty()){
            if(Utils.checkemail(edt_signin_email.getText().toString().trim())){
                if(!edt_signin_password.getText().toString().trim().isEmpty()){
                    Utils.showToast(getApplicationContext(), "Login Successful");
                    startActivity(new Intent(this, Step_1.class));
                } else {
                    Utils.showToast(getApplicationContext(), "Please enter a Password");
                }
            } else {
                Utils.showToast(getApplicationContext(), "Please enter a valid Email");
            }
        } else {
            Utils.showToast(getApplicationContext(), "Please enter an Email");
        }
    }

    public void create_account(View view){
        if(!edt_signup_email.getText().toString().trim().isEmpty()){
            if(Utils.checkemail(edt_signup_email.getText().toString().trim())){
                if(!edt_signup_password.getText().toString().trim().isEmpty()){
                    if(!edt_signup_confirm_password.getText().toString().trim().isEmpty()){
                        if(edt_signup_password.getText().toString().trim().equals(edt_signup_confirm_password.getText().toString()
                        .trim())) {
                            Utils.showToast(getApplicationContext(), "Registration Successful");
                        } else {
                            Utils.showToast(getApplicationContext(), "Password does not match");
                        }
                    } else {
                        Utils.showToast(getApplicationContext(), "Please enter Confirm Password");
                    }
                } else {
                    Utils.showToast(getApplicationContext(), "Please enter a Password");
                }

            } else {
                Utils.showToast(getApplicationContext(), "Please enter a valid Email");
            }

        } else {
            Utils.showToast(getApplicationContext(), "Please enter an Email");
        }
    }

}