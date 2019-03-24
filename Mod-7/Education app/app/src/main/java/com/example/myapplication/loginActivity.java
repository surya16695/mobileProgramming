package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class loginActivity extends AppCompatActivity {
    EditText user;
    EditText passd;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user = findViewById(R.id.name);
        passd =findViewById(R.id.pass);
        login =  findViewById(R.id.login);


    }
    private void validate(String username, String password){
        if ((username.equals("admin")) && (password.equals("navyaapp")) ){
            Intent intentlogin = new Intent(this, topics_cover.class);
            startActivity(intentlogin);
        }
    }
}
