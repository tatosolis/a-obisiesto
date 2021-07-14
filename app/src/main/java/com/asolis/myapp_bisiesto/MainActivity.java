package com.asolis.myapp_bisiesto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView anio;
    private int divisor;
    public static final String enviar_año = "Año";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anio = findViewById(R.id.txtYear);
    }

    public void verifica(View view) {
         String año =anio.getText().toString();
        int year=Integer.parseInt(año);

        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))){
            Toast.makeText(this, "año largo, es bisiesto", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MA_MuestraAnio.class);
            intent.putExtra(enviar_año,año);
            startActivity(intent);

        }
        else {
            Toast.makeText(this, "no es bisiesto", Toast.LENGTH_SHORT).show();

        }


    }
}