package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.SearchEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button b1,b2,b3,b4,b5,bEnvia;
    EditText textIntroduit, textEnviat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.b1);
        b1.setOnClickListener(this);

        b2=findViewById(R.id.b2);
        b2.setOnClickListener(this);

        b3=findViewById(R.id.b3);
        b3.setOnClickListener(this);

        b4=findViewById(R.id.b4);
        b4.setOnClickListener(this);
        textIntroduit=findViewById(R.id.textIntroduit);

        bEnvia=findViewById(R.id.bEnvia);
        bEnvia.setOnClickListener(this);
        textEnviat=findViewById(R.id.textEnvia);

    }

    @Override
    public void onClick(View view) {
        Button b = (Button)view;

        if(b.getId() == R.id.b1){
            Intent intent = new Intent(this, Actividad2.class);
            startActivity(intent);
        }
        else if (b.getId() == R.id.b2){
            Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:112"));
            startActivity(intent2);


        }
        else if(b.getId() == R.id.b3){
            Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:41.2, 2.1"));
            startActivity(intent3);
        }
        else if(b.getId() == R.id.b4){
            Intent intent4 = new Intent(Intent.ACTION_WEB_SEARCH);
            intent4.putExtra(SearchManager.QUERY, textIntroduit.getText());
            startActivity(intent4);
        }
        else if(b.getId() == R.id.bEnvia){
            Intent intent5 = new Intent(this, Actividad2.class);
            Bundle sac = new Bundle();
            sac.putString("NomLogin",textEnviat.getText().toString());
            intent5.putExtras(sac);
            startActivity(intent5);
        }

    }
}