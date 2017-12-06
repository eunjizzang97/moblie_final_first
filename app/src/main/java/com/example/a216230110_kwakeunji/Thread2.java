package com.example.a216230110_kwakeunji;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import static java.lang.Thread.sleep;
import static java.lang.Thread4.sleep;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import static java.lang.Thread4.sleep;

*//**
 * Created by 곽은지 on 2017-12-05.
 *//*
public class Thread4 extends Activity {
    ImageThread thread;

    ImageSwitcher switcher;
    Button button, button2;

    int[] imageArray = {R.drawable.imoticon_1, R.drawable.imoticon_2, R.drawable.imoticon_3};
    int index = 0;
    Handler handler = new Handler();

    @SuppressLint("CutPasteId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread);
        switcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);

        switcher.setFactory(new ViewSwitcher.ViewFactory() {
            public ImageView makeView() {
                ImageView imagView = new ImageView(getApplicationContext());
                return imagView;
            }
        });

        Animation in = new AnimationUtils().loadAnimation(this, android.R.anim.slide_in_left);
        Animation out = new AnimationUtils().loadAnimation(this, android.R.anim.slide_out_right);

        switcher.setInAnimation(in);
        switcher.setOutAnimation(out);
    }

    public void start() {
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                thread = new ImageThread();
                thread.start();
            }
        });
    }

    public void stop() {
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                thread.animationStop();
            }
        });
    }

    class ImageThread extends Thread4 {

                    Thread4 thread = new Thread4();
        boolean running = false;

        public void run() {

            running = true;
            while (running) {

                handler.post(new Runnable() {
                    public void run() {
                        switcher.setImageResource(imageArray[index]);
                        switcher.invalidate();
                    }
                });

                try {
                    sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                index++;
                if (index >= imageArray.length) {
                    index = 0;
                }
            }
        }

        public void animationStop() {
            running = false;
        }
    }
}

//
//import android.app.Activity;
//import android.os.Bundle;
//
//public class Thread4 extends Activity {
//    protected void onCreate(Bundle savedInstanceState) {
//
//        super.onCreate(savedInstanceState);
//    }
//}
//
//
////import android.os.AsyncTask;
////import android.os.Bundle;
////import android.os.Handler;
////import android.os.Message;
////import android.support.v7.app.AppCompatActivity;
////import android.widget.TextView;
////
////import java.text.SimpleDateFormat;
////import java.util.Calendar;
////import java.util.GregorianCalendar;
////
////import static java.lang.Thread4.sleep;
////
////public class Thread4 extends AppCompatActivity{
////    TextView Date;
////    TextView Gre;
////    UsedAsync asyncTask;
////    ProgressHandler handler;
////
////    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
////    String time;
////
////    protected void onCreate(Bundle savedInstanceState){
////        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_main);
////
////        Date = (TextView) findViewById(R.id.Date);
////        Gre = (TextView) findViewById(R.id.Gre);
////
////        handler = new ProgressHandler();
////
////        runTime();
////    }
////
////    public void runTime(){
////        Thread4 thread = new Thread4(new Runnable(){
////            public void run(){
////                while (true){
////                    try{
////                        time=sdf.format(new Date(System.currentTimeMillis()));
////
////                        Message message = handler.obtainMessage();
////                        handle.sendMessage(message);
////
////                        sleep(1000);
////                    }catch (InterruptedException ex){}
////                }
////            }
////        });
////        thread.start();
////
////        asyncTask = new UsedAsync();
////        asyncTask.execute();
////    }
////
////    class ProgressHandler extends Handler {
////        public void handleMessage(Message msg){
////            Date.setText(time);
////        }
////    }
////
////    class UsedAsync extends AsyncTask<Integer, Integer, Integer> {
////        Calendar cal;
////        String timeGre;
////
////        protected Integer dolnBackground(Integer... params){
////            while (isCanclled() == false){
////                cal = new GregorianCalendar();
////                timeGre = String.format("%d/%d/%d:%d:%d", cal.get(Calendar.Year), cal.get(Calendar.Month)+1,
////                        cal.get(Calendar.Day_OF_MONTH), cal.get(Calendar.HOUR), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));
////                publishProgress();
////                try{
////                    Thread4.sleep(1000);
////                }catch(InterruptedException ex){}
////            }
////            return null;
////        }
////
////        protected void onPreExecute(){
////            cal = new GregorianCalendar();
////            timeGre = String.format("%d/%d/%d %d:%d:%d", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.Day_OF_MONTH),
////                    cal.get(Calendar.HOUR), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));
////            Gre.setText(timeGre);
////
////            super.onPreExecute();
////        }
////
////        protected void onPostExecute(Integer integer){
////            super.onPostExecute(integer);
////        }
////
////        protected void onProgressUpdate(Integer... values){
////            Gre.setText(timeGre);
////
////            super.onProgressUpdate(values);
////        }
////    }
////}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//

//
//
//
//
////package com.example.a216230110_kwakeunji;
////
//import android.app.Activity;
//import android.os.Bundle;
//import android.widget.TextView;
//
///**
// * Created by 곽은지 on 2017-12-05.
// */
//
//public class Thread4 extends Activity{
//    protected void onCreate(Bundle savedInstanceState)
//    {
//        super.onCreate(savedInstanceState);
//
//        String activityName = getClass().getSimpleName();
//
//        TextView tv = new TextView(this);
//        tv.setText(activityName + " 화면");
//        setContentView(tv);
//    }
//}
//
//
////package com.example.a216230110_kwakeunji;
////
////import android.app.Activity;
////
/////**
//// * Created by 곽은지 on 2017-12-05.
//// */
////
////public class Thread4 extends Activity{
////}
