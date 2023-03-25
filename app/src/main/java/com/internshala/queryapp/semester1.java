package com.internshala.queryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class semester1 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.semester1);


        Button phy = findViewById(R.id.physics);
        Button maths = findViewById(R.id.maths);
        Button BEE = findViewById(R.id.BEE);
        Button EDG = findViewById(R.id.EDG);
        Button eng = findViewById(R.id.eng);

        phy.setOnClickListener(this);
        maths.setOnClickListener(this);
        BEE.setOnClickListener(this);
        EDG.setOnClickListener(this);
        eng.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {



        }
}
