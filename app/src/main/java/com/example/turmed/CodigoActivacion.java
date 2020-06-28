package com.example.turmed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CodigoActivacion extends AppCompatActivity implements View.OnClickListener {
    Button codigoactivacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codigo_activacion);
        codigoactivacion=(Button)findViewById(R.id.btnactivacion);
        codigoactivacion.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.btnactivacion){
            Intent activacion=new Intent(getApplicationContext(),Inicio.class);
            startActivity(activacion);
        }

    }
}
