package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
    public void button_pageprofile (View v) {
        Intent Goactivity7 = new Intent(ProfileActivity.this, ListViewActivity.class);
        startActivity(Goactivity7);
    }
}