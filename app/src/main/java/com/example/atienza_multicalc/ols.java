package com.example.atienza_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ols extends AppCompatActivity implements View.OnClickListener{

    Button olscal;
    EditText olsc, olsr, olsans;

    //school
    formulas solve = new formulas();
    getsandsets gas = new getsandsets();

    double ol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ols);

        olscal = findViewById(R.id.olscal);
        olsc = findViewById(R.id.olsc);
        olsr = findViewById(R.id.olsr);
        olsans = findViewById(R.id.olsans);

        olscal.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
    switch (v.getId()){
        case R.id.olscal:
            gas.setCurrent(Double.parseDouble(olsc.getText().toString()));
            gas.setResistance(Double.parseDouble(olsr.getText().toString()));
            ol = solve.ohms(gas.getCurrent(), gas.getResistance());
            olsans.setText(""+ol);
            break;
    }
    }
}