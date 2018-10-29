package com.slatte.vaibhav.slatte.helper;

import android.app.Activity;
import android.content.Context;
import android.util.Patterns;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import java.util.regex.Pattern;

import static android.content.Context.INPUT_METHOD_SERVICE;

public class Utils {

    public static Boolean checkemail(final String emai) {
        if(emai!=null)
        {
            Pattern pattern = Patterns.EMAIL_ADDRESS;
            if(pattern.matcher(emai).matches())
            {
                return pattern.matcher(emai).matches();
            }
        }
        return false;
    }


    public static boolean isValidMobile(String phone) {
        return android.util.Patterns.PHONE.matcher(phone).matches();
    }

    private static Toast t;
    public static void showToast(Context context, String msg){
        if(t != null)
            t.cancel();
        t = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
        t.show();
    }

    public static void hideSoftKeyboard(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager)activity.getSystemService(INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
    }

/*
    public void hideSoftKeyboard(Activity activity) {
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService(INPUT_METHOD_SERVICE);
            inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
    }
*/

/*
    */
/**
     * Shows the soft keyboard
     *//*

    public void showSoftKeyboard(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager)activity.getSystemService(INPUT_METHOD_SERVICE);
        view.requestFocus();
        inputMethodManager.showSoftInput(view, 0);
    }
*/
}