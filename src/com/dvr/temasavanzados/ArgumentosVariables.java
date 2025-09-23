/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.temasavanzados;

/**
 *
 * @author MB91491
 */
public class ArgumentosVariables {
    public static void main(String[] args) {        
        System.out.println("*** Argumentos ***");
        imprimirNumeros(1,2,3,4,5,6,7);
        variosParametros("KArla", 10,12,3);
    }

    private static void imprimirNumeros(int... numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    private static void variosParametros(String nombre, int... numeros) {
        System.out.println("nombre "+nombre);
        imprimirNumeros(numeros);
    }
    
    
    
}
