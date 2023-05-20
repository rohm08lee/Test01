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
public class ListActivity extends Activity{
    String msg = "Android : ";


    ListView simpleList;
    String countryList[] = {"India", "China", "australia", "Portugle", "America", "NewZealand"};

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Log.d(msg, "The onCreate() event");
        simpleList = (ListView)findViewById(R.id.simpleListView1);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.list_layout, R.id.listTextView, countryList);
        simpleList.setAdapter(arrayAdapter);
    }
}
