package com.example.atienza_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class nlms extends AppCompatActivity implements View.OnClickListener{

    Button nlmscal;
    EditText nlmsmass, nlmsace, nlmsans;

    //School
    formulas solve = new formulas();
    getsandsets gas = new getsandsets();

    double nlm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nlms);

        nlmscal = findViewById(R.id.nlmscal);
        nlmsace = findViewById(R.id.nlmsace);
        nlmsmass = findViewById(R.id.nlmsmass);
        nlmsans = findViewById(R.id.nlmsans);

        nlmscal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.nlmscal:
            gas.setMass2(Double.parseDouble(nlmsmass.getText().toString()));
            gas.setAcceleration(Double.parseDouble(nlmsace.getText().toString()));
            nlm = solve.nlm(gas.getMass2(), gas.getAcceleration());
            nlmsans.setText(""+nlm);
            break;
        }

    }
}