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
public class LeerTiposDatos {
    public static void main(String[] args) {
        // Leer distintos tipos de datos
        Scanner consola = new Scanner(System.in);
        
        // Leer tipo int
        System.out.println("Ingrsa tu edad");
        int edad = consola.nextInt();
        System.out.println("Edad "+edad);
        // Leer un tipo double
        System.out.println("Ingresa tu altura ");
        double altura = consola.nextDouble();
        System.out.println("Altura "+altura);
        // Consumimos el caracter de salto de linea
        consola.nextLine();
        // Leer tipo String
        System.out.println("Ingresa tu nombre ");
        String nombre = consola.nextLine();
        System.out.println("Nombre "+nombre);
        
        // Conversion de datos
        System.out.println("Proporciona un valor entero");
        String enteroString = consola.nextLine();
        int entero = Integer.parseInt(enteroString);
        System.out.println("Enterostring "+entero);
        // Tipo flotante
        System.out.println("Proporciuana un foltante");
        float flotante = Float.parseFloat(consola.nextLine());
        System.out.println("Flotante "+flotante);
        
        //Double.parseDouble();
        //Boolean.parseBoolean();
    }
}
