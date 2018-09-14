package com.example.dors.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txt;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.txt);
        textView = findViewById(R.id.textView);
//        Oncreate opens and executes the app for the time, when it is not in memory
//        ONstart is called after Oncreate, and it is automatically executed
//        Onpause when your app is not in foregroung
//        Onresume
//        Onstop is when you completely close the app

    }

    public void showText (View v){
        Log.d("MYTEST","Clicked");
        String input = txt.getText().toString();
        textView.setText(input);
    }
}
