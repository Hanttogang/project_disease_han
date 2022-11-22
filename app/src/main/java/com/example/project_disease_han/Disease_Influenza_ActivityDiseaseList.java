package com.example.project_disease_han;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Disease_Influenza_ActivityDiseaseList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease_influenza);
        getSupportActionBar().setTitle("  인플루엔자(독감) 정보");

        getSupportActionBar().setIcon(R.drawable.disease_panda);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
}