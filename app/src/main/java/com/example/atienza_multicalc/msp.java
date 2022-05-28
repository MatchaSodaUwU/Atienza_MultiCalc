package com.example.atienza_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class msp extends AppCompatActivity implements View.OnClickListener{
    Button P6,Geom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        P6 = findViewById(R.id.P6);
        Geom = findViewById(R.id.Geom);

        P6.setOnClickListener(this);
        Geom.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.P6:
                Intent intent = new Intent(msp.this, P6s.class);
                startActivity(intent);
            case R.id.Geom:
                Intent intent1 = new Intent(msp.this, Geoms.class);
                startActivity(intent1);
        }
    }
}