/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.arreglos9;

import java.util.Scanner;

/**
 *
 * @author MB91491
 */
public class PromedioCalificaciones {
    public static void main(String[] args) {        
        System.out.println("*** Promedio de Calificaciones ***");
        
        //Variables
        Scanner consola = new Scanner(System.in);
        double promedio;
        int totalCalificaciones;
        double[] calificaciones;
        double sumaCalificaciones = 0.0;
        
        // Solicitamos numero de calificaciones
        System.out.print("Cuantas calificaciones desas agregar? ");
        totalCalificaciones = consola.nextInt();
        calificaciones = new double[totalCalificaciones];
        
        //  Solicitamos las calificaciones
        for (int i = 0; i < totalCalificaciones; i++) {
            System.out.print("Calificacion["+i+"]= ");
            calificaciones[i] = consola.nextDouble();
            sumaCalificaciones += calificaciones[i];
        }
        
        // Calculamos el promedio
        promedio = sumaCalificaciones / calificaciones.length;
        
        // imprimimos el resultado
        System.out.println();
        System.out.println("Promedio de las calificaciones: "+promedio);
        
    }
}
