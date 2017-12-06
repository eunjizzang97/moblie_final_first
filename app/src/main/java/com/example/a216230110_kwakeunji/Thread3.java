//package com.example.a216230110_kwakeunji;
//
//import android.annotation.SuppressLint;
//import android.app.Activity;
//import android.os.Bundle;
//import android.os.Handler;
//import android.os.Message;
//import android.util.Log;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;
//
///**
// * Created by 곽은지 on 2017-12-06.
// */
//
//public class Thread4 extends Activity {
//
//    public int inputNumber;
//
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_thread2);
//
//        EditText EditText;
//        TextView Count_TextView;
//        Button Button;
//
//        int inputNumber;
//
//        EditText = (EditText) findViewById(R.id.EditText);
//        Count_TextView = (TextView) findViewById(R.id.Count_TextView);
//        Button = (Button) findViewById(R.id.button2);
//    }
//
//    public void button_Click(){
//        String input;
//        input = EditText.getText().toString();
//        Count_TextView.setText(input);
//
//        if(input.equals("")){
//            Toast.makeText(this, "공백입니다", Toast.LENGTH_SHORT).show();
//        }else{
//
//        }
//
//        inputNumber = Integer.parseInt(input);
//
//        if(inputNumber==0){
//            Toast.makeText(this, "0은 입력할수 없습니다", Toast.LENGTH_SHORT).show();
//            return;
//        }
//        Button.setEnabled(false);
//
//    }
//
//    @SuppressLint("HandlerLeak")
//    final Handler handler = new Handler(){
//        public String Count_TextView;
//
//        @Override
//        public void handleMessage(Message msg){
//            if(msg.what4==1){
//                Log.d("What Number : ", "What is 1");
//            }else if(msg.what==2){
//                Log.d("What Number : ", "What is 2");
//            }
//            Count_TextView.setText(""+inputNumber);
//            if(inputNumber==0){
//                Toast.makeText(Thread4.this, "카운트가 완료되었습니다", Toast.LENGTH_SHORT).show();
//                Button.setEnabled(true);
//            }
//        }
//    };
//
//
////    public void sleep(){
////    }
//    Runnable task = new Runnable(){
//
//
//        public void run(){
//            while(inputNumber > 0){
//                try {
//                    Thread4.sleep(1000);
//                } catch (InterruptedException e) {}
//
//                --inputNumber;
//
//                handler.sendEmptyMessage(1);
//
//                Message message= Message.obtain();
//                message.what = 2;
//                handler.sendMessage(message);
//            }
//        }
//    };
//
//    Thread4 thread = new Thread4(task);
//    thread.start();
//
//
//
//
//}
