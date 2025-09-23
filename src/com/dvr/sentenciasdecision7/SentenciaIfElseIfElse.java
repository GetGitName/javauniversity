/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.sentenciasdecision7;

/**
 *
 * @author MB91491
 */
public class SentenciaIfElseIfElse {
    public static void main(String[] args) {        
        System.out.println("*** Uso de la sentencia if-else if-else ***");
        int edad = 16;
        if(edad >= 18){
            System.out.println("mayor de edad");
        } else if(edad >= 13 && edad < 18) {
            System.out.println("Eres un adolescente");
        } else {
            System.out.println("Eres un niño");
        }
    }
}
