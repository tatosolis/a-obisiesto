package com.asolis.myapp_bisiesto;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MA_MuestraAnio extends AppCompatActivity {

    private ListView lista;
    ArrayList<String> meses = new ArrayList<>();
    ArrayList<Integer> num = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_muestra_anio);
        Intent intent = getIntent();

        TextView year = (TextView) findViewById(R.id.anioconsultado);
        TextView semanas = (TextView) findViewById(R.id.semanas);
        TextView dias = (TextView) findViewById(R.id.dias);

        int mes;
        int dia;
        int anio;
        String mensaje1 = intent.getStringExtra(MainActivity.enviar_año);
        year.setText(mensaje1);
        semanas.setText("Semanas del año 53");
        dias.setText("Dias del año 366");


        lista = findViewById(R.id.listameses);

        meses.add("ENERO");
        meses.add("FEBRERO");
        meses.add("MARZO");
        meses.add("ABRIL");
        meses.add("MAYO");
        meses.add("JUNIO");
        meses.add("JULIO");
        meses.add("AGOSTO");
        meses.add("SEPTIEMBRE");
        meses.add("OCTUBRE");
        meses.add("NOVIEMBRE");
        meses.add("DICIEMBRE");

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);
        num.add(8);
        num.add(9);
        num.add(10);
        num.add(11);
        num.add(12);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, meses);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            int mes2 = num.get(position)-1;
            int dia = 1;
            int anio2= Integer.parseInt(year.getText().toString());
                DatePickerDialog dpd = new DatePickerDialog(MA_MuestraAnio.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                    }
                },anio2,mes2,dia);
                dpd.show();
            }
        });


    }

    public void checa(View view) {
    }
}