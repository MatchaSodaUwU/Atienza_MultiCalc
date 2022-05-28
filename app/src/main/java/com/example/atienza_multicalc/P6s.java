package com.example.atienza_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class P6s extends AppCompatActivity implements View.OnClickListener{
    Button ol, aves, density, nlm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p6s);

        ol = findViewById(R.id.ol);
        aves = findViewById(R.id.aves);
        density = findViewById(R.id.density);
        nlm = findViewById(R.id.nlm);

        ol.setOnClickListener(this);
        aves.setOnClickListener(this);
        density.setOnClickListener(this);
        nlm.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ol:
                Intent intent = new Intent(P6s.this, ols.class);
                startActivity(intent);
            case R.id.aves:
                Intent intent1 = new Intent(P6s.this, Avess.class);
                startActivity(intent1);
            case R.id.density:
                Intent intent2 = new Intent(P6s.this, dens.class);
                startActivity(intent2);
            case R.id.nlm:
                Intent intent3 = new Intent(P6s.this, nlms.class);
                startActivity(intent3);
        }

    }
}