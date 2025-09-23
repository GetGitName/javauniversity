/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dvr.temasavanzados;

/**
 *
 * @author MB91491
 */
public interface Traductor {
    public void traducir();
    default void iniciarTraductor(){
        System.out.println("Iniciando traductor");
    }
    
}

class PruebaTraductor {
    public static void main(String[] args) {        
        System.out.println("*** traductor ***");
        Traductor ingles = new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();
        Traductor aleman = new Aleman();
        aleman.iniciarTraductor();
        aleman.traducir();
    }
}
