package com.example.turmed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registro_Activity extends AppCompatActivity implements View.OnClickListener {
    Button btnregistrar;
    EditText nombre,apellidos,correo,telefono,contrasena,Vcontra;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        btnregistrar=(Button)findViewById(R.id.btnregistrar);
        btnregistrar.setOnClickListener(this);
        Elementos();
    }

    private void Elementos() {
        nombre=(EditText)findViewById(R.id.edtnombre);
        apellidos=(EditText)findViewById(R.id.edtapellidos);
        correo=(EditText)findViewById(R.id.edtemail);
        telefono=(EditText)findViewById(R.id.edttelefono);
        contrasena=(EditText)findViewById(R.id.edtcontrasena);
        Vcontra=(EditText)findViewById(R.id.edtvcontrasena);
    }

    @Override
    public void onClick(View view) {
        //Intent codigoa= new Intent(getApplicationContext(),CodigoActivacion.class);
        //startActivity(codigoa);
        switch (view.getId()){
            case R.id.btnregistrar:
                ObtenerPreferencias();
                LeerPreferencias();
                break;
        }
    }

    private void ObtenerPreferencias() {
        preferences=getSharedPreferences("Preferences", Context.MODE_PRIVATE);
        editor=preferences.edit();
        String spnombre=nombre.getText().toString();
        String spapellidos=apellidos.getText().toString();
        String spcorreo=correo.getText().toString();
        String sptelefono=telefono.getText().toString();
        String spcontrasena=contrasena.getText().toString();
        String spvcontrasena=Vcontra.getText().toString();

        editor.putString("Nombre",spnombre);
        editor.putString("Apellidos",spapellidos);
        editor.putString("Correo",spcorreo);
        editor.putString("Telefono",sptelefono);
        editor.putString("Contraseña",spcontrasena);
        editor.putString("Vcontraseña",spvcontrasena);
        editor.commit();

    }

    private void LeerPreferencias() {
        String leernombre=preferences.getString("Nombre",null);
        String leerapellidos=preferences.getString("Apellidos",null);
        String leercorreo=preferences.getString("Correo",null);
        String leertelefono=preferences.getString("Telefono",null);
        String leercontrasena=preferences.getString("Contraseña",null);
        String leervcontrasena=preferences.getString("VContraseña",null);
        Toast.makeText(this,"Se guardaron los siguientes datos: " +leernombre+" "+leerapellidos+" "+leercorreo+" "+leertelefono+" "+leercontrasena+" "
                +leervcontrasena,Toast.LENGTH_LONG).show();
    }
}
