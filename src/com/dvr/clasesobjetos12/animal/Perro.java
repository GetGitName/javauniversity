/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.clasesobjetos12.animal;

/**
 *
 * @author MB91491
 */
public class Perro extends Animal{
    
    @Override
    public void hacerSonido(){
        System.out.println("El perro hace wauf.");
    }

    @Override
    protected void dormir() {
        System.out.println("Duermo 15 horas al día");
        System.out.println("Metodo clase padre");        
        super.dormir();
    }
    
}
