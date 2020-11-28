package com.example.formulariocontacto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Validacion extends AppCompatActivity {
    TextView vFecha,vNombre,vTelefono,vEmail,vDescripcion;
    String fecha,nombre,telefono,descripcion,email;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validacion);

        //Enlazando Los view con las variables
        vFecha=(TextView) findViewById(R.id.vFecha);
        vNombre=(TextView) findViewById(R.id.vNombre);
        vTelefono=(TextView) findViewById(R.id.vTelefono);
        vEmail=(TextView) findViewById(R.id.vEmail);
        vDescripcion=(TextView) findViewById(R.id.vDescripcion);

        Bundle extras=getIntent().getExtras();
        fecha=extras.getString("fecha");
        nombre=extras.getString("nombre");
        telefono=extras.getString("telefono");
        descripcion=extras.getString("descripcion");
        email=extras.getString("email");

        vFecha.setText(fecha);
        vNombre.setText(nombre);
        vTelefono.setText(telefono);
        vEmail.setText(email);
        vDescripcion.setText(descripcion);


    }

    public void vclic(View view) {
        onBackPressed();
        finish();
    }
}