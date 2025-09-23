/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.ciclos8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MB91491
 */
public class JuegoAdivinanzas {
    public static void main(String[] args) {        
        System.out.println("*** Juego de adivinanzas ***");
        
        
        // Variables para el juego
        Scanner consola =  new Scanner(System.in);
        Random aleatorio = new Random();
        int numeroAleatorio = aleatorio.nextInt(50)+1;
        int numeroIngresado = 0;
        int numeroIntentos = 0;
        final int MAXIMO_INTENTOS = 5;
        
        // Solicitamos el numero
        System.out.println("### Solo tienes "+MAXIMO_INTENTOS+" intentos ###");
                
        
        while(numeroAleatorio != numeroIngresado && numeroIntentos < MAXIMO_INTENTOS) {            
            
            System.out.print("Adivina el numero secreto (1-50): ");
            numeroIngresado = consola.nextInt();
            
            
            // Agregar una ayuda para orientar al jugador
            if(numeroIngresado < numeroAleatorio)
                System.out.println("El numero secreto es mayor");
            else if(numeroIngresado > numeroAleatorio)
                System.out.println("El numero secreto es menor");
            
            
            numeroIntentos++;
        }
        
        if (numeroAleatorio == numeroIngresado) {
            System.out.printf("Enhorabuena!!!, lo has logrado  en %d intentos... numero secreto: %d\n", numeroIntentos, numeroAleatorio);
        } else {
            System.out.println("Lo sentimos, has alcanzado el numero de intentos maximo.");
        }
        
        
    }
}
