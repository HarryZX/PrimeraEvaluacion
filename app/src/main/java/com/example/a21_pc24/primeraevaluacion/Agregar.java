package com.example.a21_pc24.primeraevaluacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Agregar extends AppCompatActivity {
    private EditText nombre;
    private EditText codigo;
    private EditText materia;
    private EditText parcial;
    private EditText parcial2;
    private EditText parcial3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);
        nombre = findViewById(R.id.txtnombre);
        codigo = findViewById(R.id.txtcodigo);
        materia = findViewById(R.id.txtmateria);
        parcial = findViewById(R.id.txtparcial);
        parcial2 = findViewById(R.id.txtparcial2);
        parcial3 = findViewById(R.id.txtparcial3);
    }
}
