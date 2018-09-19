package com.example.dors.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    EditText txt;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.txt);
        textView = findViewById(R.id.textView);
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
//        Oncreate opens and executes the app for the time, when it is not in memory
//        ONstart is called after Oncreate, and it is automatically executed
//        Onpause when your app is not in foregroung
//        Onresume
//        Onstop is when you completely close the app

    }

    public void sendText (View v){
        Intent intent = new Intent(this, Main2Activity.class);
        EditText editText = (EditText) findViewById(R.id.txt);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
