package com.example.test01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.test01.R;
public class Activity1 extends Activity{
    String msg = "Android : ";

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
        Log.d(msg, "The onCreate() event");
        Button bt1 = findViewById(R.id.button9);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(msg, "The onClick() event");

                // call subactvity
                startActivity(new Intent(Activity1.this,MainActivity.class));
            }
        });
    }
}
