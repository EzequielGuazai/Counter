package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SingleActivity extends AppCompatActivity {

    private TextView cont;
    private int resu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single);
        cont = findViewById(R.id.contador);
    }
    public void mais(View view){
        resu = Integer.parseInt(cont.getText().toString());
        cont.setText(String.valueOf(resu + 1));
    }
    public void menos(View view){
        resu = Integer.parseInt(cont.getText().toString());
        cont.setText(String.valueOf(resu - 1));
    }

    public void reset2(View view){
        cont.setText("0");
    }
}