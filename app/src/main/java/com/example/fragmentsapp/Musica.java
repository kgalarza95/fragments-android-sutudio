package com.example.fragmentsapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Musica extends Fragment {


    public Musica() {
    }

    public static Musica newInstance(String param1, String param2) {
        Musica fragment = new Musica();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, // cargar Fragment en contenedor padre
                             ViewGroup container,//grupo de vistas
                             Bundle savedInstanceState // pasar datos entre vistas
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_musica, container, false);
    }
}