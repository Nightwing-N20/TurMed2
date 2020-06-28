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

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btncuenta,Isesion;
    EditText usuario,contrasena;

    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btncuenta=(Button)findViewById(R.id.btncuenta);
        Isesion=(Button)findViewById(R.id.btniniciosesion);
        usuario=(EditText)findViewById(R.id.edtusuario);
        contrasena=(EditText)findViewById(R.id.edtcontrasena);
        //
        btncuenta.setOnClickListener(this);
        Isesion.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.btncuenta){
            Intent cuenta=new Intent(getApplicationContext(),Registro_Activity.class);
            startActivity(cuenta);
        }else if (view.getId()==R.id.btniniciosesion){
            validarusuario();
        }
    }

    private void validarusuario() {
        preferences=getSharedPreferences("Preferences", Context.MODE_PRIVATE);

        String scorreo=usuario.getText().toString();
        String stelefono=usuario.getText().toString();
        String scontrasena=contrasena.getText().toString();

        String spCorreo=preferences.getString("Correo",null);
        String spTelefono=preferences.getString("Telefono",null);
        String spContrasena=preferences.getString("Contraseña",null);

        if (scorreo.equals(spCorreo)&&scontrasena.equals(spContrasena)) {
            Intent ingreso = new Intent(getApplicationContext(), Inicio.class);
            startActivity(ingreso);
            finish();
        }else if (stelefono.equals(spTelefono)&&scontrasena.equals(spContrasena)){
            Intent ingreso=new Intent(getApplicationContext(),Inicio.class);
            startActivity(ingreso);
            finish();
        }else {
            Toast.makeText(getApplicationContext(),"Datos incorrectos",Toast.LENGTH_SHORT).show();
        }


    }
}
