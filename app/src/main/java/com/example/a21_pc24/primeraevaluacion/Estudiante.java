package com.example.a21_pc24.primeraevaluacion;

public class Estudiante {
    public String Nombre;
    public String Codigo;
    public String Materia;
    public Double Parcial1;
    public Double Parcial2;
    public Double Parcial3;
    public Double promedio;

    public Estudiante(String nombre, String codigo, String materia, Double parcial1, Double parcial2, Double parcial3, Double promedio) {
        Nombre = nombre;
        Codigo = codigo;
        Materia = materia;
        Parcial1 = parcial1;
        Parcial2 = parcial2;
        Parcial3 = parcial3;
        this.promedio = promedio;
    }
}
