package com.example.yuechengshi.day19hw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    //public static String a = "Lehigh University, Bethlehem BS in CHE and CS";
    //public static String b = "Java, Matlab, Aspen";
    //public static String c = "Dance, Music, Running";
    //public static String d = "Unit Operation Lab 2015 fall - 2016 Spring";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        //String msg = intent.getCharSequenceExtra("Message").toString();
        //Toast.makeText(this,msg, Toast.LENGTH_LONG).show();

        String value1 = getIntent().getStringExtra("education");
        String value2 = getIntent().getStringExtra("skills");
        String value3 = getIntent().getStringExtra("hobbies");
        String value4 = getIntent().getStringExtra("professional");


        TextView txv1 = (TextView) findViewById(R.id.textView1);
        TextView txv2 = (TextView) findViewById(R.id.textView2);
        TextView txv3 = (TextView) findViewById(R.id.textView3);
        TextView txv4 = (TextView) findViewById(R.id.textView4);
        txv1.setText(value1);
        txv2.setText(value2);
        txv3.setText(value3);
        txv4.setText(value4);



    }

    public void back(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        //intent.putExtra("Message", "Hello World");
        startActivity(intent);

    }

}