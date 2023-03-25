package com.internshala.queryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class semester4 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.semester4);


        Button OS = findViewById(R.id.OS);
        Button DM = findViewById(R.id.D_M);
        Button DAA = findViewById(R.id.DAA);
        Button DBMS = findViewById(R.id.DBMS);
        Button eng = findViewById(R.id.eng);
        Button FLAT = findViewById(R.id.FLAT);

        OS.setOnClickListener(this);
        DM.setOnClickListener(this);
        DAA.setOnClickListener(this);
        DBMS.setOnClickListener(this);
        eng.setOnClickListener(this);
        FLAT.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}


