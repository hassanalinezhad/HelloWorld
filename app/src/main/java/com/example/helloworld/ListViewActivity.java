package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ListView;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.content.Intent;

public class ListViewActivity extends AppCompatActivity {
    ListView mListView;
    String[] langProgramm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        mListView = findViewById(R.id.list_view);

        langProgramm = new String[] {"C++", "C#", "Python", "Java", "PHP",
                "JavaScript", "Kotlin" , "Ruby" , "Swift", "TypeScript" , "Go"};

        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, langProgramm);

        mListView.setAdapter(mAdapter);
    }
    public void btn_listView (View v) {
        Intent Goactivity3 = new Intent(ListViewActivity.this, ProfileActivity.class);
        startActivity(Goactivity3);
    }
}