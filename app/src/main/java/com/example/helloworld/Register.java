package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void Btn_log_regpage (View v) {
        Intent Goactivity1 = new Intent(Register.this , Login.class);
        startActivity(Goactivity1);
    }
    public void submit_regpage (View v) {
        Intent Goactivity5 = new Intent(Register.this, ProfileActivity.class);
        startActivity(Goactivity5);
    }
}