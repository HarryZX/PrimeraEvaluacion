package com.example.a21_pc24.primeraevaluacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Principal extends AppCompatActivity {
    //Declaramos las variables
    private AdaptadorEstudiante adaptadorestudiante;
    private Button guardar;
    private ArrayList<Estudiante> listaestudiantes;
    private Button agregarest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        //Inicializamos las variables
        agregarest = findViewById(R.id.btnagregar);
        guardar = findViewById(R.id.btnguardar);
        listaestudiantes = new ArrayList<>();
        adaptadorestudiante = new AdaptadorEstudiante(this, listaestudiantes);

        agregarest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(Principal.this, Agregar.class);
                startActivity(siguiente);
            }
        });

        //inicializamos el listview
        ListView listView = findViewById(R.id.lista);
        //agregamos el adapter al listview
        listView.setAdapter(adaptadorestudiante);

        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Principal.this, Mostrar.class);
                startActivity(intent);
            }
        });

        /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Principal.this,"Estudiante "+adaptadorestudiante.getPosition())
            }
        });*/
    }
}
