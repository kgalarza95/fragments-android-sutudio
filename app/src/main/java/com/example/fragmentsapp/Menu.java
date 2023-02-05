package com.example.fragmentsapp;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class Menu extends Fragment {

    // id de botones de la vista del fragment
    private final int[] BOTONES_MENU = {R.id.linterna, R.id.musica, R.id.nivel};
    private final int[] BOTONES_SELECTED = {R.drawable.linterna2, R.drawable.misca2, R.drawable.nivel2};

    private int botonIlum = 99999;

    public Menu() {
    }

    public static Menu newInstance(String param1, String param2) {
        Menu fragment = new Menu();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

/*    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }*/

    public View onCreateView(LayoutInflater inflater, // cargar Fragment en contenedor padre
                             ViewGroup container,//grupo de vistas
                             Bundle savedInstanceState // pasar datos entre vistas
    ) {
        //ogtener la vista del fragment
        View vistaMenu = inflater.inflate(R.layout.fragment_menu, container, false);

        //identificar en que actividad me encuentro y que botón fue pulsado

        if (getArguments() != null) {
            botonIlum = getArguments().getInt("btnPulsado");
        }

        ImageButton btnMenu;

        for (int i = 0; i < this.BOTONES_MENU.length; i++) {
            //obtener los botones de la vista y agregarles eventos a cada uno.
            btnMenu = (ImageButton) vistaMenu.findViewById(BOTONES_MENU[i]);

            if (botonIlum == i) {
                btnMenu.setImageResource(this.BOTONES_SELECTED[i]);
            }

            final int miBoton = i;

            btnMenu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //identificar en que actividad me enceuntro
                    Activity miActivity = getActivity();//obtener actividad actual

                    //castear para llamar al metodo menu de la interfaz "ComunicaMenu" de un objeto Activity
                    ((ComunicaMenu) miActivity).menu(miBoton);


                }
            });
        }


        return vistaMenu;
    }
}