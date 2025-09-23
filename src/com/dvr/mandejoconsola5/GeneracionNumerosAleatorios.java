/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.mandejoconsola5;

import java.util.Random;

/**
 *
 * @author MB91491
 */
public class GeneracionNumerosAleatorios {
    public static void main(String[] args) {
        System.out.println("*** Numeros aleatorios ***");
        Random random = new Random();
        
        // generar un numero aleatorio entre 0 y 9
        int numeroaAleatorio = random.nextInt(10);
        System.out.println("numeroAleatorio entre 0 y 9= "+numeroaAleatorio);
        
        // generar un numero aleaorio entre 1 y 10
        numeroaAleatorio = random.nextInt(10)+1;
        System.out.println("numeroAleatorio entre 1 y 10= "+numeroaAleatorio);
        
        // Generar un numero flotante entre 0.0  y 1.0
        float flotanteAleatorio = random.nextFloat();
        System.out.println("Flotante aleatorio "+flotanteAleatorio);
        
        //simular el lanzamiento de un dado ()1 y 6
        System.out.println("Resultado de lanzar el dado = "+(random.nextInt(6)+1));
    }
}
