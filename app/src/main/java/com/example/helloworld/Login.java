package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }
    public void Btn_reg_loginpage(View v) {
        Intent Goactivity = new Intent(Login.this , Register.class);
        startActivity(Goactivity);
    }
    public void submit_loginpage (View v) {
        Intent Goactivity4 = new Intent(Login.this, ProfileActivity.class);
        startActivity(Goactivity4);
    }
}