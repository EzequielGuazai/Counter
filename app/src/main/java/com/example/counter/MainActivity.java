package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void teamC(View view){
        Intent teamActivity = new Intent(MainActivity.this, TeamActivity.class);
        MainActivity.this.startActivity(teamActivity);
    }
    public void single(View view){
        Intent singleActivity = new Intent(MainActivity.this, SingleActivity.class);
        MainActivity.this.startActivity(singleActivity);
    }
}