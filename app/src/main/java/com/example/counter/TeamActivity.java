package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TeamActivity extends AppCompatActivity {
    private TextView resuTeam1;
    private TextView resuTeam2;
    private TextView divTv;

    private int resu1, resu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
        resuTeam1 = findViewById(R.id.team1_tv);
        resuTeam2 = findViewById(R.id.team2_tv);
    }

   /* public void diferenca(){
        if (resu1 >= resu2){
            divTv.setText(String.valueOf(resu1-resu2));

        }else {
            divTv.setText(String.valueOf(resu2-resu1));
        }
    }*/

    public void maisT1(View view){
        resu1 = Integer.parseInt(resuTeam1.getText().toString());
        resuTeam1.setText(String.valueOf(resu1 + 1));
    }
    public void menosT1(View view){
        resu1 = Integer.parseInt(resuTeam1.getText().toString());
        resuTeam1.setText(String.valueOf(resu1 - 1));
    }

    public void maisT2(View view){
        resu2 = Integer.parseInt(resuTeam2.getText().toString());
        resuTeam2.setText(String.valueOf(resu2 + 1));
    }
    public void menosT2(View view){
        resu2 = Integer.parseInt(resuTeam2.getText().toString());
        resuTeam2.setText(String.valueOf(resu2 - 1));
    }

    public void reset(View view){
        resuTeam1.setText("0");
        resuTeam2.setText("0");
    }

}