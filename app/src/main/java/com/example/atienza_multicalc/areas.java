package com.example.atienza_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class areas extends AppCompatActivity implements View.OnClickListener{

    Button areascal;
    EditText areas1, areasans, areas2;

    //school
    formulas solve = new formulas();
    getsandsets gas = new getsandsets();

    double square;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areas);

        areascal = findViewById(R.id.areascal);
        areas1 = findViewById(R.id.areas1);
        areasans = findViewById(R.id.areasans);
        areas2 = findViewById(R.id.areas2);

        areascal.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.areascal:
                gas.setSide1(Double.parseDouble(areas1.getText().toString()));
                gas.setSide2(Double.parseDouble(areas2.getText().toString()));
                square = solve.square(gas.getSide1(), gas.getSide2());
                areasans.setText("" + square);
                break;
        }


    }
}