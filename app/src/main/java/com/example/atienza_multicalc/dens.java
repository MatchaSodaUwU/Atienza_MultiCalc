package com.example.atienza_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class dens extends AppCompatActivity implements View.OnClickListener{

    EditText densmass, densvolume, densans;
    Button denscal;

    //school
    formulas solve = new formulas();
    getsandsets gas = new getsandsets();

    double dens;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dens);

        densmass = findViewById(R.id.densmass);
        densvolume = findViewById(R.id.densvol);
        denscal = findViewById(R.id.denscal);
        densans = findViewById(R.id.densans);

        denscal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.denscal:
                gas.setMass(Double.parseDouble(densmass.getText().toString()));
                gas.setVolume(Double.parseDouble(densvolume.getText().toString()));
                dens = solve.density(gas.getMass(),gas.getVolume());
                densans.setText(""+ dens);
                break;
        }

    }
}