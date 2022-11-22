package com.example.project_disease_han;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Disease_Cre_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease_cre);
        getSupportActionBar().setTitle("  카바페넴내성장내세균속균종(CRE) 정보");

        getSupportActionBar().setIcon(R.drawable.disease_panda);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
}