package com.example.formulariocontacto;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText mFecha,mNombre,mTelefono,mEmail,mDescripcion;
    String fecha,nombre,telefono,descripcion,email,a;
    int dia,mes,ano;


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


        a="auxiliar";
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
        //finish();
    }


    public void fClic(View view) {
        final Calendar c=Calendar.getInstance();
        dia=c.get(Calendar.DAY_OF_MONTH);
        mes=c.get(Calendar.MONTH);
        ano=c.get(Calendar.YEAR);
        DatePickerDialog picker=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                mFecha.setText(dayOfMonth+"/"+(month+1)+"/"+year);
            }
        },dia,mes,ano);
        picker.show();
    }
}