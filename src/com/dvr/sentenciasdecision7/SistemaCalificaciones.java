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
public class SistemaCalificaciones {
    public static void main(String[] args) {        
        System.out.println("*** Sistema de calficaciones ***");
        
        // Varibale para pedir datos al usuacio
        Scanner consola = new Scanner(System.in);
        
        // Solicitud de datos al usuario
        System.out.print("Ingresa una calificación del 1 - 10: ");
        double calificacionNumero = Double.parseDouble(consola.nextLine());
        
        String calificacionLetra;
        
        if(calificacionNumero >= 9 && calificacionNumero <= 10){
            calificacionLetra = "A";
        } else if(calificacionNumero >= 8 && calificacionNumero < 9) {
            calificacionLetra = "B";
        } else if(calificacionNumero >= 7 && calificacionNumero < 8){
            calificacionLetra = "C";
        } else if(calificacionNumero >= 6 && calificacionNumero < 7) {
            calificacionLetra = "D";
        } else if(calificacionNumero >= 0 && calificacionNumero < 6){
            calificacionLetra = "F";
        } else {
            calificacionLetra = "Calificacion numerica desconocida.";
        }
        
        if(calificacionNumero >= 0 && calificacionNumero <= 10){
            System.out.println("Tu calificacion es: "+calificacionLetra);
        } else {
            System.out.println(calificacionLetra);
        }
                
    }
}
