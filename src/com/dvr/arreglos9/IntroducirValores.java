/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.arreglos9;

import java.util.Scanner;

/**
 *
 * @author MB91491
 */
public class IntroducirValores {
    public static void main(String[] args) {        
        System.out.println("*** Valores dinamicos ***");
        
        //Introducir valores a un arreglo
        Scanner consola = new Scanner(System.in);
        
        // declarar el arreglo
        System.out.print("Proporcina el largo del arreglo: ");
        int largoArreglo = consola.nextInt();
        
        // creamos de manera dinamica el arreglo
        int[] enteros = new int[largoArreglo];
        
        for (int i = 0; i < enteros.length; i++) {
            System.out.print("Ingresa num entero: ");
            enteros[i] = consola.nextInt();
        }
        
        // imprimir
        for (int i = 0; i < enteros.length; i++) {
            System.out.println("enteros["+i+"] = "+enteros[i]);
        }
                
    }
}
