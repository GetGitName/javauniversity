/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.ciclos8;

/**
 *
 * @author MB91491
 */
public class NumerosParesFor {
    public static void main(String[] args) {        
        System.out.println("*** Numeros pares con For ***");
        for(int i = 0; i <= 20;i++){
            System.out.print((i%2==0)?i+" ":"");
        }
    }
}
