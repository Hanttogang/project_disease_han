package com.example.project_disease_han;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Disease_Mites_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease_mites);
        getSupportActionBar().setTitle("  쯔쯔가무시증 정보");

        getSupportActionBar().setIcon(R.drawable.disease_panda);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
}