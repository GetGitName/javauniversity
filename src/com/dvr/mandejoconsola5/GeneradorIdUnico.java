/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.mandejoconsola5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MB91491
 */
public class GeneradorIdUnico {
    public static void main(String[] args) {
        System.out.println("*** Sistema Generador de ID único ***");
        
        Scanner consola = new Scanner(System.in);
        
        //Solicitar datos
        System.out.print("Ingresa tu nombre: ");
        String nombre = consola.nextLine();
        System.out.print("Ingresa tu apellido: ");
        String apellido = consola.nextLine();
        System.out.print("Ingresa año de nacimiento (YYYY): ");
        String anioNacimiento = consola.nextLine();
        
        // Normalizar datos
        String nombreNormalizado = nombre.trim().substring(0,2).toUpperCase();
        String apellidoNormalizado = apellido.trim().substring(0,2).toUpperCase();
        String anioNormalizado = anioNacimiento.substring(2).trim();
        Random aleatorio = new Random();
        int numeroAleatorio = aleatorio.nextInt(9999)+1;
        
        // Generación de id unico
        System.out.println("Hola "+nombre);
        System.out.println("\tTu nuevo número de identificación (ID) generado por el sistema es: ");
        System.out.printf("\t%s%s%s%04d%n",nombreNormalizado,apellidoNormalizado,anioNormalizado,numeroAleatorio);
        System.out.println("\tFelicidades!");
                
    }
}
