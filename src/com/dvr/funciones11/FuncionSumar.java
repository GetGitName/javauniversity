/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.funciones11;

/**
 *
 * @author MB91491
 */
public class FuncionSumar {
    
    //Definimos la funcion sumar
    static int sumar(int a, int b){
        int resultado = a + b;
        return resultado;
    }
    
    public static void main(String[] args) {        
        System.out.println("*** Funcion de sumar ***");
        int arb1 = 3, arg2 = 8, resultado_funcion;
        resultado_funcion = sumar(arg2, arb1);
        System.err.println("Resultado: "+resultado_funcion);
        resultado_funcion = sumar(10, 24);
        System.out.print("REsultado2: "+resultado_funcion);
        
    }
}
