/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.temasavanzados;

/**
 *
 * @author MB91491
 */
public class Excepciones {
    public static void main(String[] args) {        
        System.out.println("*** Excepcion ***");
        try {
            int v1 = 10, v2 =0, resultado = v1/v2;
            System.out.println("resultado = " + resultado);
        } catch (Exception e) {
            System.out.println("Ocurrio un error "+e);
        }
        
    }
}
