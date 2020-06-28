package com.example.turmed.navegacion.Configuracion;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.turmed.R;

public class Consultorio extends Fragment {


    public Consultorio() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View placesview=inflater.inflate(R.layout.fragment_consultorio, container, false);


        return placesview;
    }

}
