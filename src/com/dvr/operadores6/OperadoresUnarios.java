/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.operadores6;

/**
 *
 * @author MB91491
 */
public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** Operadores unarios ***");
        int a=3, b=2, resultado;
        boolean c=true;
        
        // operador unario +
        resultado = +a;
        System.out.println("resultado +a "+resultado);
        
        // operador unario -
        resultado = -a;
        System.out.println("resultado -a "+resultado);
        
        // Operadores unarios incremento/decremento
        //Pre-incremento
        a = 3;
        resultado = ++a; // primero se incrementa el valor
        System.out.println("resultado ++a "+resultado);
        System.out.println("a ya se incremento "+a);
        
        //post-incremento
        a = 3;
        resultado = a++; // primero se incrementa el valor
        System.out.println("resultado a++ "+resultado);
        System.out.println("a en este momento se incrementa "+a);
        
        //Pre-decremento
        b = -2;
        resultado = --b;
        System.out.println("resultado --b "+resultado);
        System.out.println("b ya se incremento "+b);
        
        //post-decremento
        b = -2;
        resultado = b--;
        System.out.println("resultado --b "+resultado);
        System.out.println("b en este momento se incrementa "+b);
        
    }
}
