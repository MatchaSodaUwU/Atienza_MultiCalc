package com.example.atienza_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class areat extends AppCompatActivity implements View.OnClickListener{

    Button areatcal;
    EditText areath, areatb, areatans;

    formulas solve = new formulas();
    getsandsets gas = new getsandsets();

    double tri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areat);

        areatcal = findViewById(R.id.areatcal);
        areath = findViewById(R.id.areath);
        areatb = findViewById(R.id.areatb);
        areatans = findViewById(R.id.areatans);

        areatcal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.areatcal:
                gas.setHeight(Double.parseDouble(areath.getText().toString()));
                gas.setBase(Double.parseDouble(areatb.getText().toString()));
                tri = solve.triangle(gas.getBase(), gas.getHeight());
                areatans.setText(""+ tri);
                break;
        }
    }
}