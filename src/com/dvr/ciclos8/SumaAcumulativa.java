/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.ciclos8;

/**
 *
 * @author MB91491
 */
public class SumaAcumulativa {
    public static void main(String[] args) {        
        System.out.println("*** Suma acumulativa ***");
        
        int suma = 0;
        int contador = 1;
        
        while(contador<=5){
            suma += contador++;
            System.out.println(suma);            
        }
    }
}
