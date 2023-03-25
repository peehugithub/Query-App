package com.internshala.queryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class semester3 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.semester3);


        Button DELD = findViewById(R.id.DELD);
        Button maths = findViewById(R.id.maths);
        Button BE = findViewById(R.id.BE);
        Button OOP = findViewById(R.id.OOP);
        Button eng = findViewById(R.id.eng);
        Button DSA = findViewById(R.id.DSA);
        Button EVS = findViewById(R.id.EVS);

        DELD.setOnClickListener(this);
        maths.setOnClickListener(this);
        BE.setOnClickListener(this);
        OOP.setOnClickListener(this);
        eng.setOnClickListener(this);
        DSA.setOnClickListener(this);
        EVS.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}

