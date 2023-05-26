package com.example.test01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.test01.R;

public class MainActivity extends Activity {
    String msg = "Android : ";

    /**
     * Called when the activity is first created.
     */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "The onCreate() event");

        Button bt1 = findViewById(R.id.button1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(msg, "The onClick() event");

                // call subactvity
                startActivity(new Intent(MainActivity.this,SubActivity.class));
            }
        });
        Button bt2 = findViewById(R.id.button2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(msg, "The onClick() event");

                // call subactvity
                startActivity(new Intent(MainActivity.this,Activity1.class));
            }
        });
        Button bt3 = findViewById(R.id.button3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(msg, "The onClick() event");

                // call subactvity
                startActivity(new Intent(MainActivity.this,ListActivity.class));
            }
        });
        Button bt4 = findViewById(R.id.button4);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(msg, "The onClick() event");

                // call subactvity
                startActivity(new Intent(MainActivity.this,CustomListActivity.class));
            }
        });

    }
}