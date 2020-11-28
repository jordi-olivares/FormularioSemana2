package com.example.formulariocontacto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText mFecha,mNombre,mTelefono,mEmail,mDescripcion;
    String fecha,nombre,telefono,descripcion,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Enlazando Los view con las variables
        mFecha=(EditText)findViewById(R.id.mFecha);
        mNombre=(EditText)findViewById(R.id.mNombre);
        mTelefono=(EditText)findViewById(R.id.mTelefono);
        mEmail=(EditText)findViewById(R.id.mEmail);
        mDescripcion=(EditText)findViewById(R.id.mDescripcion);

    }

    public void clic(View v){
        fecha=mFecha.getText().toString();
        nombre=mNombre.getText().toString();
        telefono=mTelefono.getText().toString();
        email=mEmail.getText().toString();
        descripcion=mDescripcion.getText().toString();

        Intent i=new Intent(this,Validacion.class);
        i.putExtra("fecha",fecha);
        i.putExtra("nombre",nombre);
        i.putExtra("telefono",telefono);
        i.putExtra("email",email);
        i.putExtra("descripcion",descripcion);
        startActivity(i);
        finish();
    }
}