package com.example.atienza_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Geoms extends AppCompatActivity implements View.OnClickListener{
    Button areas, arear,areat,areac;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geoms);

        areas = findViewById(R.id.areas);
        arear = findViewById(R.id.arear);
        areat = findViewById(R.id.areat);
        areac = findViewById(R.id.areac);

        areas.setOnClickListener(this);
        arear.setOnClickListener(this);
        areat.setOnClickListener(this);
        areac.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.areas:
                Intent intent = new Intent(Geoms.this, areas.class);
                startActivity(intent);
            case R.id.arear:
                Intent intent1 = new Intent(Geoms.this, arear.class);
                startActivity(intent1);
            case R.id.areat:
                Intent intent2 = new Intent(Geoms.this, areat.class);
                startActivity(intent2);
            case R.id.areac:
                Intent intent3 = new Intent(Geoms.this, areac.class);
                startActivity(intent3);

        }


    }
}