package com.example.turmed.navegacion.Configuracion;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.fragment.app.Fragment;

import com.example.turmed.R;


public class Horarios extends Fragment {
    Spinner domingoam,domingopm,lunesam,lunespm,martesam,martespm,miercolesam,miercolespm,juevesam,
    juevespm,viernesam,viernespm,sabadoam,sabadopm;


    public Horarios() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View horarios=inflater.inflate(R.layout.fragment_horarios, container, false);

        //DOMINGO
        domingoam=(Spinner)horarios.findViewById(R.id.spdomingoAM);
        domingopm=(Spinner)horarios.findViewById(R.id.spdomingoPM);
        //LUNES
        lunesam=(Spinner)horarios.findViewById(R.id.splunesAM);
        lunespm=(Spinner)horarios.findViewById(R.id.splunesPM);
        //MARTES
        martesam=(Spinner)horarios.findViewById(R.id.spmartesAM);
        martespm=(Spinner)horarios.findViewById(R.id.spmartesPM);
        //MIERCOLES
        miercolesam=(Spinner)horarios.findViewById(R.id.spmiercolesAM);
        miercolespm=(Spinner)horarios.findViewById(R.id.spmiercolesPM);
        //JUEVES
        juevesam=(Spinner)horarios.findViewById(R.id.spjuevesAM);
        juevespm=(Spinner)horarios.findViewById(R.id.spjuevesPM);
        //VIERNES
        viernesam=(Spinner)horarios.findViewById(R.id.spviernesAM);
        viernespm=(Spinner)horarios.findViewById(R.id.spviernesPM);
        //SABADO
        sabadoam=(Spinner)horarios.findViewById(R.id.spsabdAM);
        sabadopm=(Spinner)horarios.findViewById(R.id.spsabadoPM);

        //SPINNER DOMINGO
        ArrayAdapter<CharSequence>domingoA=ArrayAdapter.createFromResource(
                getActivity().getBaseContext(),
                R.array.horariosam, android.R.layout.simple_spinner_item
        );
        domingoA.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        domingoam.setAdapter(domingoA);
        ArrayAdapter<CharSequence>domingP=ArrayAdapter.createFromResource(
                getActivity().getBaseContext(),
                R.array.horariospm, android.R.layout.simple_spinner_item
        );
        domingP.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        domingopm.setAdapter(domingP);

        //SPINNER SABADO
        ArrayAdapter<CharSequence>sabadoA=ArrayAdapter.createFromResource(
                getActivity().getBaseContext(),
                R.array.horariosam, android.R.layout.simple_spinner_item
        );
        sabadoA.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sabadoam.setAdapter(sabadoA);
        ArrayAdapter<CharSequence>sabadoP=ArrayAdapter.createFromResource(
                getActivity().getBaseContext(),
                R.array.horariospm,android.R.layout.simple_spinner_item
        );
        sabadoP.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sabadopm.setAdapter(sabadoP);

        //SPINNER LUNES
        ArrayAdapter<CharSequence>lunesA=ArrayAdapter.createFromResource(
                getActivity().getBaseContext(),
                R.array.horariosam, android.R.layout.simple_spinner_item
        );
        lunesA.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        lunesam.setAdapter(lunesA);
        ArrayAdapter<CharSequence>lunesP=ArrayAdapter.createFromResource(
                getActivity().getBaseContext(),
                R.array.horariospm, android.R.layout.simple_spinner_item
        );
        lunesP.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        lunespm.setAdapter(lunesP);

        //SPINNER MARTES
        ArrayAdapter<CharSequence>martesA=ArrayAdapter.createFromResource(
                getActivity().getBaseContext(),
                R.array.horariosam, android.R.layout.simple_spinner_item
        );
        martesA.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        martesam.setAdapter(martesA);
        ArrayAdapter<CharSequence>martesP=ArrayAdapter.createFromResource(
                getActivity().getBaseContext(),
                R.array.horariospm, android.R.layout.simple_spinner_item
        );
        martesP.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        martespm.setAdapter(martesP);

        //SPINNER MIERCOLES
        ArrayAdapter<CharSequence>miercolesA=ArrayAdapter.createFromResource(
                getActivity().getBaseContext(),
                R.array.horariosam, android.R.layout.simple_spinner_item
        );
        miercolesA.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        miercolesam.setAdapter(miercolesA);
        ArrayAdapter<CharSequence>miercolesP=ArrayAdapter.createFromResource(
                getActivity().getBaseContext(),
                R.array.horariospm, android.R.layout.simple_spinner_item
        );
        miercolesP.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        miercolespm.setAdapter(miercolesP);

        //SPINNER JUEVES
        ArrayAdapter<CharSequence>juevesA=ArrayAdapter.createFromResource(
                getActivity().getBaseContext(),
                R.array.horariosam, android.R.layout.simple_spinner_item
        );
        juevesA.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        juevesam.setAdapter(juevesA);
        ArrayAdapter<CharSequence>juevesP=ArrayAdapter.createFromResource(
                getActivity().getBaseContext(),
                R.array.horariospm, android.R.layout.simple_spinner_item
        );
        juevesP.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        juevespm.setAdapter(juevesP);

        //SPINER VIERNES
        ArrayAdapter<CharSequence>viernesA=ArrayAdapter.createFromResource(
                getActivity().getBaseContext(),
                R.array.horariosam, android.R.layout.simple_spinner_item
        );
        viernesA.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        viernesam.setAdapter(viernesA);
        ArrayAdapter<CharSequence>viernesP=ArrayAdapter.createFromResource(
                getActivity().getBaseContext(),
                R.array.horariospm, android.R.layout.simple_spinner_item
        );
        viernesP.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        viernespm.setAdapter(viernesP);


        return horarios;

    }
}
