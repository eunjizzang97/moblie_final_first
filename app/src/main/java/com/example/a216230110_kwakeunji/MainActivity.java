package com.example.a216230110_kwakeunji;

import android.annotation.SuppressLint;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost mTab = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;

        // 첫 번째 탭
        intent = new Intent(this, Thread.class);
        spec = mTab.newTabSpec("Thread4").setIndicator("Thread4").setContent(intent);
        mTab.addTab(spec);

        // 두 번째 탭
        intent = new Intent(this, DB.class);
        spec = mTab.newTabSpec("DB").setIndicator("DB").setContent(intent);
        mTab.addTab(spec);

        // 세 번째 탭
        intent = new Intent(this, Maps.class);
        spec = mTab.newTabSpec("Maps").setIndicator("Maps").setContent(intent);
        mTab.addTab(spec);

        // 네 번째 탭
        intent = new Intent(this, Web.class);
        spec = mTab.newTabSpec("Web").setIndicator("Web").setContent(intent);
        mTab.addTab(spec);
    }

    @SuppressLint("ResourceType")
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.layout.activity_main, menu);
        return true;
    }
}


//package com.example.a216230110_kwakeunji;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//}
