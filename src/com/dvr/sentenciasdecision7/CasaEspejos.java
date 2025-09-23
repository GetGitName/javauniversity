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
public class CasaEspejos {
    public static void main(String[] args) {        
        System.out.println("*** Bienvenido a la casa de los espejos ***");
        
        Scanner consola = new Scanner(System.in);
        
        System.out.print("Cual es tu edad: ");
        int edad = Integer.parseInt(consola.nextLine());
        
        System.out.print("Tienes miedo a la oscuridad true/false: ");
        boolean tienesMiedoOscuridad = Boolean.parseBoolean(consola.nextLine());        
        
        // verificacion
        if(!tienesMiedoOscuridad && edad >= 10) {
            System.out.println("Puedes entrar a la casa de los espejos");
        } else {
            System.out.println("Lo siento la casa de los espejos podría darte miedo.");
        }
    }
}
