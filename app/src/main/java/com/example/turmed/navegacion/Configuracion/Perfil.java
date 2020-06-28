package com.example.turmed.navegacion.Configuracion;

import android.R.layout;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.turmed.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Perfil extends Fragment {
    Spinner especialidad,citas,moneda;


    public Perfil() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview=inflater.inflate(R.layout.fragment_perfil, container, false);
        especialidad=(Spinner)rootview.findViewById(R.id.spespecialidad);
        citas=(Spinner)rootview.findViewById(R.id.spduracion);
        moneda=(Spinner)rootview.findViewById(R.id.spmoneda);
        //SPINNER ESPECIALIDAD
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(
                getActivity().getBaseContext(),
                R.array.listaespecialidad, layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(layout.simple_dropdown_item_1line);
        especialidad.setAdapter(adapter);
        //SPINNER DURACION DE CITA
        ArrayAdapter<CharSequence>citaAdapter=ArrayAdapter.createFromResource(
                getActivity().getBaseContext(),
                R.array.listacitas, layout.simple_spinner_item
        );
        citaAdapter.setDropDownViewResource(layout.simple_dropdown_item_1line);
        citas.setAdapter(citaAdapter);
        //SPINNER TIPO DE MONEDA
        ArrayAdapter<CharSequence>monedaAdapter=ArrayAdapter.createFromResource(
                getActivity().getBaseContext(),
                R.array.listamoneda,layout.simple_spinner_item
        );
        monedaAdapter.setDropDownViewResource(layout.simple_dropdown_item_1line);
        moneda.setAdapter(monedaAdapter);
        return rootview;
    }


}
