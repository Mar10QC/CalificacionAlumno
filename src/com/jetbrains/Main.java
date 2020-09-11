package com.jetbrains;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String nombre = "Mario";
        Integer[] calificaciones = {50, 60, 70, 80, 90};
        imprimirCalificaciones(nombre, promedio(calificaciones), calificaciones, LetraCalificacion(promedio(calificaciones)));
    }

    private static double promedio(Integer[] calificaciones) {
        double promedio = 0;
        Iterator<Integer>  iterador = Arrays.stream(calificaciones).iterator();
        while (iterador.hasNext()){
            promedio += iterador.next();
        }
        promedio = promedio/5;
        return promedio;
    }

    private  static String LetraCalificacion(double promedio){
        String LetraCalificacion = "";
        if (promedio <= 50){
            LetraCalificacion = "F";
        } else if (promedio > 50 && promedio <=60){
            LetraCalificacion = "E";
        } else if (promedio > 60 && promedio <=70){
            LetraCalificacion = "D";
        } else if (promedio > 70 && promedio <=80){
            LetraCalificacion = "C";
        } else if (promedio > 80 && promedio <=90){
            LetraCalificacion = "B";
        } else if (promedio > 90){
            LetraCalificacion = "A";
        }
        return  LetraCalificacion;
    }

    private static void imprimirCalificaciones(String nombre, double promedio, Integer[] calificaciones, String calificaion){
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < 5; i++){
            System.out.println("Calificación " + (i+1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificaion);
    }
}
