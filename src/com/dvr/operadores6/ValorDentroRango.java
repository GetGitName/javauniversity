/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.operadores6;

import java.util.Scanner;

/**
 *
 * @author MB91491
 */
public class ValorDentroRango {
    public static void main(String[] args) {        
        System.out.println("*** Valor dentro rango ***");
        // definimos los limiees
        final int MINIMO = 0;
        final int MAXIMO = 5;
        Scanner consola = new Scanner(System.in);
        
        //solicitar un vallor entr 0 y 5
        System.out.println("Proporcina un número entre 0 y 5: ");
        int numero = Integer.parseInt(consola.nextLine());
        // Verificar si el dato esta dentro del rango
        boolean estaDentroRango = numero >= MINIMO && numero <= MAXIMO;
        System.out.println("estaDentroRango = " + estaDentroRango);
        
        
    }
}
