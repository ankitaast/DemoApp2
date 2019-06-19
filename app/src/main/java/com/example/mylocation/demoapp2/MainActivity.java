package com.example.mylocation.demoapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText email,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email=findViewById(R.id.etxt);
        pass=findViewById(R.id.ptxt);
    }

    public void login(View view) {
        String e = email.getText().toString();
        String p = pass.getText().toString();

        //. Toast.makeText(this,e+" Hello  "+p,Toast.LENGTH_SHORT).show();
        if(e.isEmpty()) {
            email.setError("Email is required");
            return;
        }
        if(p.isEmpty()){
            email.setError("Password is required");
        return;
    }

        Intent in =new Intent(getApplicationContext(),home.class);
        in.putExtra("email",e);
        in.putExtra("password",p);
        startActivity(in);


    }
}
