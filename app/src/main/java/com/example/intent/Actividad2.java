package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Actividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        Bundle sacRebut = getIntent().getExtras();


        String nom = sacRebut.getString("NomLogin");

        TextView textView = findViewById(R.id.textRebut);
        textView.setText("Hola " + nom);



    }
}