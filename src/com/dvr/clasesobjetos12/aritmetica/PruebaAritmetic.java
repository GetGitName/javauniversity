/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.clasesobjetos12.aritmetica;

/**
 *
 * @author MB91491
 */
public class PruebaAritmetic {
    public static void main(String[] args) {        
        System.out.println("*** Ejemplo Aritmetica ***");
        Aritmetica a1 = new Aritmetica(5, 7);
        
        System.out.println("A1 "+a1.getOperador1());
        a1.setOperando1(44);
        System.out.println("A1 "+a1.getOperador1());
        
        a1.sumar();
        a1.restar();
    }
}
