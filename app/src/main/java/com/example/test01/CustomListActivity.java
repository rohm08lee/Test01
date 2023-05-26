package com.example.test01;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CustomListActivity extends Activity{
    String msg = "Android : ";

    ListView simpleList;
    String countryList[] = {"India", "China", "australia", "portugal", "America", "NewZealand"};
    int flags[] = {R.drawable.india, R.drawable.china, R.drawable.australia, R.drawable.portugal, R.drawable.america, R.drawable.new_zealand};


    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Log.d(msg, "The onCreate() event");
//        simpleList = (ListView)findViewById(R.id.simpleListView1);
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.list_layout, R.id.listTextView, countryList);
//        simpleList.setAdapter(arrayAdapter);

        simpleList = (ListView) findViewById(R.id.simpleListView1);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList, flags);
        simpleList.setAdapter(customAdapter);

    }
}
