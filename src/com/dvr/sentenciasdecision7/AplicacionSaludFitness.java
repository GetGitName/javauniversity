/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.sentenciasdecision7;

import java.util.Scanner;

/**
 *
 * @author MB91491
 */
public class AplicacionSaludFitness {
    public static void main(String[] args) {        
        System.out.println("*** Aplicacion de salud y fitness ***");
        // Constantes
        final int META_PASOS_DIARIO = 10000;
        final double CALORIAS_POR_PASO = 0.04; // valor aproximado, son kcalorias
        
        // pedimos los valores al usuario
        Scanner consola = new Scanner(System.in);
        
        System.out.print("Cual es tu nombre?: ");
        String nombre = consola.nextLine();
        
        System.out.print("Cuiantos pasos has caminado hoy?: ");
        int pasos = Integer.parseInt(consola.nextLine());
        
        // verificar si el usuario alcanzo la meta de pasos diarios
        String metaAlcanzada = (pasos >= META_PASOS_DIARIO) ? "Sí :D" : "No :(";
        
        // Calculamos las calorias quemadas
        double caloriasQuemadas = pasos * CALORIAS_POR_PASO;
        
        // Mostramos la informacion
        System.out.printf("Usuario: %s\n",nombre);
        System.out.printf("Pasos dados: %d\n", pasos);
        System.out.printf("Calorias quemadas: %.2f kcal\n", caloriasQuemadas);
        System.out.printf("Meta de pasos diario alcanzada: %s\n", metaAlcanzada);
        System.out.println("-------------------------------------------------");
        System.out.printf("La meta de pasos diarios es de: %d\n", META_PASOS_DIARIO);
        
    }
            
}
