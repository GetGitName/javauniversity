/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.mod4.cadenas;

/**
 *
 * @author MB91491
 */
public class ManejoSubcadenas {
    public static void main(String[] args) {
        // Subcadenas
        String cadena1 = "Hola Mundo";
        System.out.println("Cdena original "+cadena1);
        
        //Subcadena1 
        String subcadena1 = cadena1.substring(0,4);
        System.out.println("Subcadena 1 "+subcadena1);
        
        //Subcadena2
        String subcadena2 = cadena1.substring(5);
        System.out.println("Subcadena 2 "+subcadena2);
    }
}
