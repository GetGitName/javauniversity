/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.mandejoconsola5;

import java.util.Scanner;

/**
 *
 * @author MB91491
 */
public class RecetasCocina {
    public static void main(String[] args) {
        System.out.println("*** Recetas de cocina ***");
        
        Scanner consola = new Scanner(System.in);
        
        // Nombre receta
        System.out.print("Ingresa el nombre: ");
        String nombreReceta = consola.nextLine();
        
        //Ingredientes de la receta separados por ,
        System.out.print("Ingresa los ingredientes (Separados por ,): ");
        String ingredientesReceta = consola.nextLine();
        
        // Tiempo de preparacion
        System.out.print("Ingresa el tiempo de preparacion (min): ");
        int tiempoPreparacion = Integer.parseInt(consola.nextLine());
        
        //Dificultad
        System.out.print("Ingresa la dificultad: ");
        String dificultadReceta = consola.nextLine();
        
        // Imprimir datos de la recete
        System.out.println("\n--- Receta de Cocina ---");
        System.out.println("Nombre receta: "+nombreReceta);
        System.out.println("Ingredientes: "+ingredientesReceta);
        System.out.println("Tiempo de preparacion: "+tiempoPreparacion+" minutos");
        System.out.println("Dificultad (Fácil, Medio, Dificil): "+dificultadReceta);
    }
}
