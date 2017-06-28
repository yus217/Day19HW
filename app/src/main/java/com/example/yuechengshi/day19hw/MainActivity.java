package com.example.yuechengshi.day19hw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static String a = "Lehigh University, Bethlehem BS in CHE and CS";
    public static String b = "Java, Matlab, Aspen";
    public static String c = "Dance, Music, Running";
    public static String d = "Unit Operation Lab 2015 fall - 2016 Spring";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lView = (ListView) findViewById(R.id.listView1);
        final ArrayList<String> classRoster = new ArrayList<String>();
        classRoster.add("Yuecheng");
        classRoster.add("Ruth");
        classRoster.add("James");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, classRoster);
        lView.setAdapter(adapter);

        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i("Hello", classRoster.get(i));
                if (i ==0) {
                    Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                    intent.putExtra("education", a);
                    intent.putExtra("skills", b);
                    intent.putExtra("hobbies", c);
                    intent.putExtra("professional", d);
                    //intent.putExtra("Message", "Hello World");
                    startActivity(intent);
                }

            }
        });

    }


/*
    public void nextActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
        intent.putExtra("Message", "Hello World");
        startActivity(intent);

    }
    */

}
