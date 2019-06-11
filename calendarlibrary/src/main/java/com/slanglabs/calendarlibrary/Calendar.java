package com.slanglabs.calendarlibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class Calendar extends LinearLayout {


    public Calendar(Context context) {
        super(context);
        initialize(context);
    }

    public Calendar(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize(context);
    }



    private void initialize(Context context){ inflate(context, R.layout.calendar_view, this); }
}