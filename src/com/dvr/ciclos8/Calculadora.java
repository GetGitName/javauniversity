/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.ciclos8;

import java.util.Scanner;

/**
 *
 * @author MB91491
 */
public class Calculadora {
    public static void main(String[] args) {        
        System.out.println("*** Calculadora en Java ***");
        
        // Variable para entrada de datos
        Scanner consola = new Scanner(System.in);
        
        // Variables para calculadora
        double numero1 = 0.0;
        double numero2 = 0.0;
        double resultado = 0.0;
        boolean salir = false;
        
        // Mostramos las opciones de operaciones
        while (!salir) {            
            System.out.println("\nOperaciones que puedes realizar");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opcion: ");
            int opcion = consola.nextInt();
            
            consola.nextLine();
            
            if(salir){
                System.out.print("Dame el valor 1: ");
                numero1 = Double.parseDouble(consola.nextLine());

                System.out.print("Dame el valor 2: ");
                numero2 = Double.parseDouble(consola.nextLine());
            }
            
            // procesamos la opcion seleccionada
            switch (opcion) {
                case 1:
                    resultado = numero1 + numero2;
                    System.out.printf("Resultado de la suma: %.2f\n", resultado);
                    break;
                case 2:
                    resultado = numero1 - numero2;                    
                    System.out.printf("Resultado de la resta: %.2f\n", resultado);
                    break;
                case 3:
                    resultado = numero1 * numero2;                 
                    System.out.printf("Resultado de la multiplicacion: %.2f\n", resultado);
                    break;
                case 4:
                    if(numero2 == 0) {
                        System.out.println("Error: división por 0");
                    } else {
                        resultado = numero1 / numero2;
                        System.out.printf("Resultado de la division: %.2f\n", resultado);
                    }
                    break;
                case 5:
                    System.out.println("Saliendo de la aplicación de calculadora...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        }
    }
}
