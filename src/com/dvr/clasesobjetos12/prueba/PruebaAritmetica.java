/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.clasesobjetos12.prueba;

import com.dvr.clasesobjetos12.aritmetica.Aritmetica;

/**
 *
 * @author MB91491
 */
public class PruebaAritmetica {
    public static void main(String[] args) {        
        System.out.println("*** Ejemplo de aritmetica ***");
        Aritmetica aritmetica1 = new Aritmetica(5, 7);
        aritmetica1.sumar();
        aritmetica1.restar();
        System.out.println("Dir. Mem obj1: "+aritmetica1);
        
        //creamos segundo objeto
        Aritmetica aritmetica2 = new Aritmetica(12, 16);
        aritmetica2.sumar();
        aritmetica2.restar();
        System.out.println("Dir. Mem obj1: "+aritmetica2);
    }
}
