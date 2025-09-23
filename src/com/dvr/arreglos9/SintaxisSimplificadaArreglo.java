/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.arreglos9;

/**
 *
 * @author MB91491
 */
public class SintaxisSimplificadaArreglo {
    public static void main(String[] args) {        
        System.out.println("*** Sintaxis simplificada de arreglos ***");
        
        //Arreglos
        int[] entereos = {100,200,300,400,500};
        
        System.out.println("enteros 0 = "+entereos[0]);
        System.out.println("enteros 1 = "+entereos[1]);
        System.out.println("enteros 2 = "+entereos[2]);
        System.out.println("enteros 3 = "+entereos[3]);
        System.out.println("enteros 4 = "+entereos[4]);
        
        System.out.println("entereos = " + entereos);
        
        System.out.println("*** For ***");
        
        for (int i = 0; i < entereos.length; i++) {
            System.out.println("indice " + i +" = " + entereos[i]);
        }
    }
}
