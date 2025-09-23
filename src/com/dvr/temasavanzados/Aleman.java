/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.temasavanzados;

/**
 *
 * @author MB91491
 */
public class Aleman implements Traductor{

    @Override
    public void traducir() {
        System.out.println("Traduciendo a Aleman");
    }
    
    @Override
    public void iniciarTraductor(){
        System.out.println("Iniciando traductor en idioma aleman");
    }
    
}
