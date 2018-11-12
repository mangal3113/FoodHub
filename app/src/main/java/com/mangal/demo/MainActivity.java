package com.mangal.demo;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btnsignIn,btnsignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsignIn=(Button)findViewById(R.id.btnSignIn);
        btnsignUp=(Button)findViewById(R.id.btnSignUp);
        btnsignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signIn=new Intent(MainActivity.this, com.mangal.demo.signIn.class);
                startActivity(signIn);

            }
        });
        btnsignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signUp=new Intent(MainActivity.this, com.mangal.demo.signUp.class);
                startActivity(signUp);
            }
        });
    }
}