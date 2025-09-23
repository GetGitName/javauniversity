/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.ciclos8;

/**
 *
 * @author MB91491
 */
public class PalabraBereakContinue {
    public static void main(String[] args) {        
        System.out.println("*** Break y continue ***");
        
        //Ejemplo brea, imprimir solo el primer numero par
        System.out.println("BREAK");
        for (int numero = 1; numero <= 10; numero++) {
            if(numero % 2 == 0){
                System.out.println("numero = " + numero);
                break;
            }
        }
        
        // ejemplo continue imprimir solo apres ignorar impar
        System.out.println("CONTINUE");
        for (int numero = 1; numero <= 10; numero++) {
            if(numero % 2 == 1){                
                continue;
            }
            System.out.println("numero = " + numero);
        }
    }
}
