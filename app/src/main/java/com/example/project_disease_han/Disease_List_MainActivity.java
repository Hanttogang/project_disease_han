package com.example.project_disease_han;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Disease_List_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.disease_list_activity_main);

        getSupportActionBar().setTitle("  감염병 리스트");

        getSupportActionBar().setIcon(R.drawable.disease_panda);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button covid19Button = (Button) findViewById(R.id.disease_covid19);
        covid19Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent covid19 = new Intent(getApplicationContext(),
                        Disease_Covid19_ActivityDiseaseList.class);
                startActivity(covid19);
            }



        });
        Button influenzaButton = (Button) findViewById(R.id.disease_influenza);
        influenzaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent influenza = new Intent(getApplicationContext(),
                        Disease_Influenza_ActivityDiseaseList.class);
                startActivity(influenza);
            }
        });

        Button monkeypoxButton = (Button) findViewById(R.id.disease_monkeypox);
        monkeypoxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent monkeypox = new Intent(getApplicationContext(),
                        Disease_Monkeypox_Activity.class);
                startActivity(monkeypox);
            }
        });

        Button chickenpoxButton = (Button) findViewById(R.id.disease_chickenpox);
        chickenpoxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chickenpox = new Intent(getApplicationContext(),
                        Disease_Chikenpox_Activity.class);
                startActivity(chickenpox);
            }
        });

        Button hepatitis_aButton = (Button) findViewById(R.id.disease_hepatitis_a);
        hepatitis_aButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hepatitis_a = new Intent(getApplicationContext(),
                        Disease_Hepatitis_A_Activity.class);
                startActivity(hepatitis_a);
            }
        });

        Button hepatitis_bButton = (Button) findViewById(R.id.disease_hepatitis_b);
        hepatitis_bButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hepatitis_b = new Intent(getApplicationContext(),
                        Disease_Hepatitis_B_Activity.class);
                startActivity(hepatitis_b);
            }
        });

        Button hepatitis_cButton = (Button) findViewById(R.id.disease_hepatitis_c);
        hepatitis_cButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hepatitis_c = new Intent(getApplicationContext(),
                        Disease_Hepatitis_C_Activity.class);
                startActivity(hepatitis_c);
            }
        });

        Button creButton = (Button) findViewById(R.id.disease_cre);
        creButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cre = new Intent(getApplicationContext(),
                        Disease_Cre_Activity.class);
                startActivity(cre);
            }
        });

        Button mumpsButton = (Button) findViewById(R.id.disease_mumps);
        mumpsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mumps = new Intent(getApplicationContext(),
                        Disease_Mumps_Activity.class);
                startActivity(mumps);
            }
        });

        Button mitesButton = (Button) findViewById(R.id.disease_mites);
        mitesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mites = new Intent(getApplicationContext(),
                        Disease_Mites_Activity.class);
                startActivity(mites);
            }
        });
    }
}