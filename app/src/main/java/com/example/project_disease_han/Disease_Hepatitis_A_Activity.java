package com.example.project_disease_han;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Disease_Hepatitis_A_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease_hepatitis_aactivity);
        getSupportActionBar().setTitle("  A형 간염 정보");

        getSupportActionBar().setIcon(R.drawable.disease_panda);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
}