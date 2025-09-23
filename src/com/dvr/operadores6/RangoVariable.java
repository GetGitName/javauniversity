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
public class RangoVariable {
    public static void main(String[] args) {        
        System.out.println("*** Rango variable ***");
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Proporcina un dato entero: ");
        int dato = Integer.parseInt(consola.nextLine());
        
        // revisamos si esta dentro de rango entre 1 y 10
        boolean estaDentroRango = dato >= 1 && dato <= 10;
        System.out.println("Variable dentro de rango 1 y 10 "+estaDentroRango);
        
        // revisamos si esta fuera de rango entre 1 y 10
        boolean estaFuearaRango = !(dato >= 1 && dato <= 10);
        System.out.println("Variable fuera de rango 1 y 10 "+estaFuearaRango);
    }
}
