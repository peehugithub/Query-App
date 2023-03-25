package com.internshala.queryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class semester2 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.semester2);


        Button phy = findViewById(R.id.physics);
        Button maths = findViewById(R.id.maths);
        Button Chemistry = findViewById(R.id.Chemistry);
        Button workshop = findViewById(R.id.workshop);
        Button eng = findViewById(R.id.eng);
        Button PPS = findViewById(R.id.PPS);

        phy.setOnClickListener(this);
        maths.setOnClickListener(this);
        Chemistry.setOnClickListener(this);
        workshop.setOnClickListener(this);
        eng.setOnClickListener(this);
        PPS.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}
