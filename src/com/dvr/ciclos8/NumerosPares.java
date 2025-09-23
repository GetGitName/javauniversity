/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.ciclos8;

/**
 *
 * @author MB91491
 */
public class NumerosPares {
    public static void main(String[] args) {        
        System.out.println("*** Numeros pares del 1 al 20 ***");
        
        int contador = 1;
        while(contador <= 20) {
            if(contador %2 == 0){
                System.out.println(contador);
            }
            contador++;
        }
    }
}
