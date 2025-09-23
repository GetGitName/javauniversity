/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.funciones11;

import java.util.Scanner;

/**
 *
 * @author MB91491
 */
public class FuncionPAr {
    
    // Funcion para saber si un numero es par
    static boolean esPar(int numero){
        return (numero % 2 == 0);
    }
    
    public static void main(String[] args) {        
        System.out.println("*** Funcion si es par ***");
        
        System.out.print("Proporciona un numero entero: ");
        int numero = new Scanner(System.in).nextInt();
        
        System.out.println("Numero par? "+esPar(numero));
    }
}
