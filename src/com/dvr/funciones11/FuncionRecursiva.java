/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.funciones11;

/**
 *
 * @author MB91491
 */
public class FuncionRecursiva {
    
    // Imprimir del 1 al 5 usando una funcion recursiva
    //Funcion recursiva
    static void funcionRecursiva(int numer){
        //caso base
        if(numer == 1) {
            System.out.print(numer + " ");
        } else {
            //caso recursovo
            System.out.print(numer + " ");
            funcionRecursiva(numer - 1);
            
        }
    }
    
    public static void main(String[] args) {        
        System.out.println("*** Funcion recursiva ***");
        funcionRecursiva(5);
    }
    
}
