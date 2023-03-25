package com.internshala.queryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class semester extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester);


        Button sem1 = findViewById(R.id.sem1);
        Button sem2 = findViewById(R.id.sem2);
        Button sem3 = findViewById(R.id.sem3);
        Button sem4 = findViewById(R.id.sem4);

        sem1.setOnClickListener(this);
        sem2.setOnClickListener(this);
        sem3.setOnClickListener(this);
        sem4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.sem1:
                Intent intent = new Intent(semester.this, semester1.class);
                startActivity(intent);
                break;
            case R.id.sem2:
                intent = new Intent(semester.this, semester2.class);
                startActivity(intent);

                break;
            case R.id.sem3:
                intent = new Intent(semester.this, semester3.class);
                startActivity(intent);
                break;
            case R.id.sem4:
                intent = new Intent(semester.this, semester4.class);
                startActivity(intent);

                break;

        }
    }
}