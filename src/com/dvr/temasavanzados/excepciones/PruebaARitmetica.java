/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.temasavanzados.excepciones;

/**
 *
 * @author MB91491
 */
public class PruebaARitmetica {
    public static void main(String[] args) {        
        System.out.println("*** Pdiv cero ***");
        try {
            int resultado = Aritmetica.division(10, 0);
            System.out.println("resultado = " + resultado);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error "+e);
        } finally {
            System.out.println("Se reviso la división entre 0");
        }
    }
}
