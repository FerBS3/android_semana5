package com.ferbs3.mostraruser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.modelos.Usuario;

public class MainActivity extends AppCompatActivity {
    Usuario usuario = new Usuario();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText pNombre = (EditText) findViewById(R.id.nombre);
        EditText pEdad = (EditText) findViewById(R.id.edad);
        EditText pIngresos = (EditText) findViewById(R.id.ingresos);
        EditText pAltura = (EditText) findViewById(R.id.altura);
        EditText pGenero = (EditText) findViewById(R.id.genero);

        pNombre.setText(usuario.getNombre());
        pEdad.setText(String.valueOf(usuario.getEdad()));
        pIngresos.setText(String.valueOf(usuario.getIngresos()));
        pAltura.setText(String.valueOf(usuario.getAltura()));
        pGenero.setText(usuario.getGenero());

        Button pSiguiente = (Button) findViewById(R.id.siguiente);
        pSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, segunda.class));
            }
        });

        }
    }