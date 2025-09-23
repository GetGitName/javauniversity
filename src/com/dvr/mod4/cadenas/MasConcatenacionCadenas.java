/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.mod4.cadenas;

/**
 *
 * @author MB91491
 */
public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        // MAs formas de concatenar cadenas en java
        String cadena1 = "Hola";
        String cadena2 = "Mundo";
        String cadena3 = cadena1 + " " +cadena2;
        System.out.println(cadena3);
        
        // Metodo concat
        cadena3 = cadena1.concat(" ").concat("Mundo");
        System.out.println(cadena3);
        
        //StringBuilder
        StringBuilder constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);
        String resultado = constructorCadenas.toString();
        System.out.println(resultado);
        
        //StringBuffer
        StringBuffer sb = new StringBuffer();
        sb.append(cadena1).append(" -sb- ").append(cadena2);
        resultado = sb.toString();
        System.out.println(resultado);
        
        // join
        resultado = String.join(" - ", cadena1, cadena2, " ----");
        System.out.println(resultado);
        
    }
}
