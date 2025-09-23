/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.mod4.cadenas;

/**
 *
 * @author MB91491
 */
public class MetodosCadenas {
    public static void main(String[] args) {
        // MEtodo de cadenas
        String cadena1 = "Hola mundo";
        
        //Obtener el largo de una cadena
        int longitud = cadena1.length();
        System.out.println("Long "+longitud);
        
        //Reemplazar caracteres
        String nuevaCadena = cadena1.replace('m', 'M');
        System.out.println("nueva cadena: "+nuevaCadena);
        
        // Convertir a maysuculas
        String mayusculas = cadena1.toUpperCase();
        System.out.println("MAys "+mayusculas);
        
        //Convertir a mayusculas
        System.out.println("Minusculas "+cadena1.toLowerCase());
        
        // Eliminar espacios el inicio y al final
        String cadena2 = "  Daniel Clades   ";        
        System.out.println("cadena2 con espacios "+cadena2);
        System.out.println("Cadema2 sin espacios "+cadena2.trim());
    }
}
