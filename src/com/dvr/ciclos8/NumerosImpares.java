/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.ciclos8;

/**
 *
 * @author MB91491
 */
public class NumerosImpares {
    public static void main(String[] args) {        
        System.out.println("*** Numeros impares ***");
        
        int i = 1;
        do {      
            if(i%2 != 0){
                System.out.print(i + " ");
            }           
            i++;
        } while (i<=20);
    }
}
