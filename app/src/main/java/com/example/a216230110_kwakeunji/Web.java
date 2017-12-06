package com.example.a216230110_kwakeunji;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by 곽은지 on 2017-12-05.
 */

public class Web extends Activity{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://hambageu.com/"));
        startActivity(intent);
    }

//    public void move1(View v){
//        Intent i = new Intent(this, Webview.class);
//        startActivity(i);
//        Intent intent = new Intent(Intent.ACTION_VIEW,
//                Uri.parse("http://hambageu.com/html/menu_index.html"));
//        startActivity(intent);
//    }
}

//public class Web extends Activity{
//    protected void onCreate(Bundle savedInstanceState)
//    {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_dev);
//        String activityName = getClass().getSimpleName();
//
//        TextView tv = new TextView(this);
//        tv.setText(activityName + " 화면");
//        setContentView(tv);
//    }
//
//    public void move1(View v){
//        Intent i = new Intent(this, Webview.class);
//        startActivity(i);
//        Intent intent = new Intent(Intent.ACTION_VIEW,
//                Uri.parse("http://hambageu.com/html/menu_index.html"));
//        startActivity(intent);
//    }
//}


//package com.example.a216230110_kwakeunji;
//
//import android.app.Activity;
//
///**
// * Created by 곽은지 on 2017-12-05.
// */
//
//public class Thread4 extends Activity{
//}
