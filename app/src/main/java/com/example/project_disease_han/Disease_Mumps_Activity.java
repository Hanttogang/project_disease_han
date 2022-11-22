package com.example.project_disease_han;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Disease_Mumps_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease_mumps);

        getSupportActionBar().setTitle("  유행성이하선염 정보");

        getSupportActionBar().setIcon(R.drawable.disease_panda);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
}