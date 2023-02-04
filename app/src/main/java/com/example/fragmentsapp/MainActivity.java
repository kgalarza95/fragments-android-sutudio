package com.example.fragmentsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ComunicaMenu{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void menu(int botonPress) {
        //ir a actividad herramienta y enviar el botón pulsado
        Intent intent = new Intent(this, ActividadHerramientas.class);

        intent.putExtra("btnPulsado",botonPress);
        startActivity(intent);
    }
}