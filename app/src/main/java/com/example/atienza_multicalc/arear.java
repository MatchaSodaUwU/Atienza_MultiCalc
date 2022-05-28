package com.example.atienza_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class arear extends AppCompatActivity implements View.OnClickListener{

    Button arearcal;
    EditText arearl, arearw, arearans;

    //school
    formulas solve = new formulas();
    getsandsets gas = new getsandsets();

    Double rect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arear);

        arearcal = findViewById(R.id.arearcal);
        arearl = findViewById(R.id.arearl);
        arearw = findViewById(R.id.arearw);
        arearans = findViewById(R.id.arearans);

        arearcal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.arearcal:
                gas.setLength(Double.parseDouble(arearl.getText().toString()));
                gas.setWidth(Double.parseDouble(arearw.getText().toString()));
                rect = solve.rectangle(gas.getLength(), gas.getWidth());
                arearans.setText(""+ rect);
        }
    }
}