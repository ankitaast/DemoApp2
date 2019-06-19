package com.example.mylocation.demoapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class home extends AppCompatActivity {

    TextView e_txt,p_txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        e_txt=findViewById(R.id.e_txt);
        p_txt=findViewById(R.id.p_txt);

        Intent in= getIntent();
        String e= in.getStringExtra("email");
        String p= in.getStringExtra("password");

        e_txt.setText(e);
        p_txt.setText(p);
    }
}
