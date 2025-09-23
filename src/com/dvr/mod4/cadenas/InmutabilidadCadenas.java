/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.mod4.cadenas;

/**
 *
 * @author MB91491
 */
public class InmutabilidadCadenas {
    public static void main(String[] args) {
        // Inmutabilidad de cadenas
        String cadena1 = "Hola";
        System.out.println(cadena1);
        String cadena2 = cadena1;
        cadena1 = "Adios";       
        System.out.println(cadena1);
        System.out.println(cadena2);
    }
}
