package com.example.a21_pc24.primeraevaluacion;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class AdaptadorEstudiante extends ArrayAdapter<Estudiante> {

    public AdaptadorEstudiante(@NonNull Context context, @NonNull List<Estudiante> objects) {
        super(context, 0, objects);
    }

    @Nullable
    @Override
    public Estudiante getItem(int position) {
        return super.getItem(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Estudiante est = getItem(position);
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_estudiante,parent,false);
        }

        TextView lblnombre = (TextView) convertView.findViewById(R.id.lblnombre);
        TextView lblcodigo = (TextView) convertView.findViewById(R.id.lblcodigo);
        TextView lblmateria = (TextView) convertView.findViewById(R.id.lblmateria);

        lblnombre.setText(est.Nombre);
        lblcodigo.setText(est.Codigo);
        lblmateria.setText(est.Materia);

        return super.getView(position, convertView, parent);
    }
}
