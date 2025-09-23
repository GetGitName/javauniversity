/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.operadores6;

/**
 *
 * @author MB91491
 */
public class OperadoresComparacion {
    public static void main(String[] args) {        
        System.out.println("*** Operadores de comparacion ***");
        int a=3, b=2;
        // igualdad ==
        boolean resultado = a == b;        
        System.out.println("resultado = " + resultado);
        
        // Distinto a != b
        resultado = a != b;
        System.out.println("resultado = " + resultado);
        
        //mayor que
        resultado = a >b;
        System.out.println("resultado = " + resultado);
        
        //mayor igual que
        resultado = a >= b;
        System.out.println("resultado = " + resultado);
        
        //menor que
        resultado = a<b;
        System.out.println("resultado = " + resultado);
        
        //menor igual que
        resultado = a<=b;
        System.out.println("resultado = " + resultado);
        
    }
}
