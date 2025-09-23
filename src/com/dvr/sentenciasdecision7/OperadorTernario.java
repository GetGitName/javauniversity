/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.sentenciasdecision7;

/**
 *
 * @author MB91491
 */
public class OperadorTernario {
    public static void main(String[] args) {        
        System.out.println("*** Uso del operador ternario ***");
        // sintaxis
        // condicion ? exp1 : exp2
        
        // Determinar si un numero es par o no
        int numero = 5;
        String resultado = (numero%2 ==0) ? "Par" : "Impar";
        
        System.out.println(resultado);
        
        //  Calcular si es maypr de edad
        int edad = 17;
        String mensaje = (edad >= 18) ? "eres mayor de edad" : "eres menor de edad";
        System.out.println(mensaje);
        
        // calor positivo, negativo o 0
        numero = -0;
        resultado = (numero > 0) ? "Positivo" : (numero < 0) ? "negativo" : "cero";
        
        System.out.println(resultado);
    }
}
