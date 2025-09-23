/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.mod4.cadenas;

/**
 *
 * @author MB91491
 */
public class ComparacionCadenas {
    public static void main(String[] args) {
        // Comparacion de cadenas (Pool de cadenas)
        String cadena1 = "Java";
        String cadena2 = "Java";
        String cadena3 = new String("Java");
        //Comparacion de cadenas (==) compara la referencia
        System.out.println("Cadena1 es igual en referencia a cadena2");
        System.out.println(cadena1 == cadena2);
        
        // Comparamos cadena 1 con cadena 3 referencias
        System.out.println("Cadena1 es igual en referencia a cadena2");
        System.out.println(cadena2 == cadena3);   
        
        // Comparar contenido usaremos el metodo equals
        System.out.println("cadema1 es igual en contenido a cadena3, no en referencia");
        System.out.println(cadena1.equals(cadena3));
    }
            
}
