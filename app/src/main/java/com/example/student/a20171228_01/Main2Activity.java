package com.example.student.a20171228_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tv2=findViewById(R.id.textView2);
        Intent it=getIntent();
        String str=it.getStringExtra("data");
        tv2.setText(str);
    }
}
