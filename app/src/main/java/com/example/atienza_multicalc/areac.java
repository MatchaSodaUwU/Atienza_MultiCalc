package com.example.atienza_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class areac extends AppCompatActivity implements View.OnClickListener {

    Button areaccal;
    EditText areacr, areacans;

    formulas solve = new formulas();
    getsandsets gas = new getsandsets();

    double circle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areac);

        areaccal = findViewById(R.id.areaccal);
        areacans = findViewById(R.id.areacans);
        areacr = findViewById(R.id.areacr);

        areaccal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.areaccal:
                gas.setRadius(Double.parseDouble(areacr.getText().toString()));
                 circle = solve.circle(gas.getRadius(), gas.getPie());
                areacans.setText(""+circle);
                break;
        }

    }
}