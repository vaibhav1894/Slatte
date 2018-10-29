package com.slatte.vaibhav.slatte.customtext;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class CustomTextViewLight extends android.support.v7.widget.AppCompatTextView {

    public CustomTextViewLight(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public CustomTextViewLight(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomTextViewLight(Context context) {
        super(context);
        init();
    }

    private void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "Fonts/Poppins-Light.ttf");
        setTypeface(tf ,1);

    }

}