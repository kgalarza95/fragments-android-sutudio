package com.example.fragmentsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;

public class ActividadHerramientas extends AppCompatActivity implements ComunicaMenu{

    // id de botones de la vista del fragment
   /* private final int[] ID_FRAGMENTOS = {R.layout.fragment_linterna, R.layout.fragment_musica,
            R.layout.fragment_nivel};*/

    Fragment[] misFragmentos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_herramientas);

        misFragmentos = new Fragment[3];

        misFragmentos[0] = new Linterna();
        misFragmentos[1] = new Musica();
        misFragmentos[2] = new Nivel();

        //obtener datos enviado desde activity anterior
        Bundle extras = getIntent().getExtras();

        //enviar booton pulsado al metodo menu
        menu(extras.getInt("btnPulsado"));
    }

    @Override
    public void menu(int botonPress) {
    /*    FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.fragment_container, ExampleFragment.class, null)
                .setReorderingAllowed(true)
                .addToBackStack("name") // name can be null
                .commit();*/

        FragmentManager miManejador = getSupportFragmentManager();//getFragmentManager();
        FragmentTransaction miTrnsaccion = miManejador.beginTransaction();

        miTrnsaccion.replace(R.id.contenedor_fragment, misFragmentos[botonPress]);
        miTrnsaccion.commit();
    }
}