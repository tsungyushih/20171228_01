package com.example.student.a20171228_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void clicl3(View v)
    {
        EditText ed3;
        ed3=findViewById(R.id.editText4);
        Intent it=new Intent();
        it.putExtra("myresult",ed3.getText().toString());
        setResult(RESULT_OK,it);
        finish();
    }
}
