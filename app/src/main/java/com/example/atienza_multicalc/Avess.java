package com.example.atienza_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.preference.EditTextPreference;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Avess extends AppCompatActivity implements View.OnClickListener{
    EditText avessdistance, avesstime, avessans;
    Button avesscal;

    //school
    formulas solve = new formulas();
    getsandsets gas = new getsandsets();

    double aves;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avess);

        //id
        avesscal = findViewById(R.id.avesscal);
        avessdistance = findViewById(R.id.avessdistance);
        avesstime = findViewById(R.id.avesstime);
        avessans = findViewById(R.id.avessans);

        avesscal.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.avesscal:
                gas.setDistance(Double.parseDouble(avessdistance.getText().toString()));
                gas.setTime(Double.parseDouble(avesstime.getText().toString()));
                aves = solve.speed(gas.getDistance(),gas.getTime());
                avessans.setText(""+aves);
                break;
        }
    }
}