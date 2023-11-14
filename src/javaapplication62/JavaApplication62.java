/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication62;

import java.util.Scanner;

/**
 *
 * @author jeshe
 */
public class JavaApplication62 {

    public static double[] calcularPromedios(double[][] calificaciones) {
        double[] promedios = new double[calificaciones.length];

        for (int i = 0; i < calificaciones.length; i++) {
            double suma = 0;
            for (int j = 0; j < calificaciones[i].length; j++) {
                suma += calificaciones[i][j];
            }
            promedios[i] = suma / calificaciones[i].length;
        }

        return promedios;
    }

    public static double calcularPromedioGeneral(double[] promedios) {
        double suma = 0;
        for (int i = 0; i < promedios.length; i++) {
            suma += promedios[i];
        }
        return suma / promedios.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] calificaciones = new double[5][5];

        String[] grupos = {"1A", "1B", "4A", "4B", "4C"};

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Ingrese las calificaciones del grupo " + grupos[i] + ":");
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.print("Calificación " + (j + 1) + ": ");
                calificaciones[i][j] = scanner.nextDouble();
            }
        }
        
        double[] promediosGrupos = calcularPromedios(calificaciones);
        double promedioGeneral = calcularPromedioGeneral(promediosGrupos);

        for (int i = 0; i < promediosGrupos.length; i++) {
            System.out.println("El promedio del grupo " + grupos[i] + " es: " + promediosGrupos[i]);
        }
        
        System.out.printf(" El promedio general de todos los grupos es: " + promedioGeneral);
    }

}