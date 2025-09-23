/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.sentenciasdecision7;

import java.util.Scanner;

/**
 *
 * @author MB91491
 */
public class MayorDeDosNumeros {
    public static void main(String[] args) {        
        System.out.println("*** Mayor de dos numeros ***");
        int numero1 = 100;
        int numero2 = 12;
        
        Scanner consola = new Scanner(System.in);
        
        System.out.print("Ingresa el numero 1: ");
        numero1 = Integer.parseInt(consola.nextLine());
        
        System.out.print("Ingresa el numero 2: ");
        numero2 = Integer.parseInt(consola.nextLine());
        
        String resultado = (numero1 > numero2) ? "Numero1 es mayor" : "Numero2 es mayor";
        System.out.println(resultado);
    }
}
