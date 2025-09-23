/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.temasavanzados.excepciones;

/**
 *
 * @author MB91491
 */
public class Aritmetica {

    public static int division(int a, int b){
        if(b == 0){
            throw new RuntimeException("División entre cero");
        }
        return a/b;
    }
}
