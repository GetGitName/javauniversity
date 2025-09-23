/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.mod4.cadenas;

/**
 *
 * @author MB91491
 */
public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        
        // Reemplazar subcadenas
        String cadena = "hola mundo";
        System.out.println(cadena);
        
        // reemplazar mundo por a todos
        String nuevaCadena = cadena.replaceAll("mundo", "a todos");
        System.out.println(nuevaCadena);
        
        // Reemplaza a Hola a adios
        nuevaCadena = cadena.replaceAll("hola", "saludos");
        System.out.println(nuevaCadena);
    }
}
