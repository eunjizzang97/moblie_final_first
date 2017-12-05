package com.example.a216230110_kwakeunji;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by 곽은지 on 2017-12-05.
 */

public class Map extends Activity{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        String activityName = getClass().getSimpleName();

        TextView tv = new TextView(this);
        tv.setText(activityName + " 화면");
        setContentView(tv);
    }
}
