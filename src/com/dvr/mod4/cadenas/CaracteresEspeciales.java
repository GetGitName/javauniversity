/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.mod4.cadenas;

/**
 *
 * @author MB91491
 */
public class CaracteresEspeciales {
    public static void main(String[] args) {
        //Caracateres especiales
        // \n - imprimir un salto de linea        
        String cadena1 = "hola\nMundo";
        System.out.println("cadena1 = "+cadena1);
        
        // \t - tabulador
        String cadena2 = "\tHola\tMundo";
        System.out.println("cadena2"+cadena2);
        
        String cadena3 = "Hola \' Mundo";
        System.out.println(cadena3);
        
        // '\"' - agregar una comilla doble
        String cadena4 = "Hola \" Mundo";
        System.out.println(cadena4);
        
        // '' \\
        String cadena5 = "Hola \\ Mundo";
        System.out.println(cadena5);
        
    }
}
