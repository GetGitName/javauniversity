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
public class CajeroAutomatico {
    public static void main(String[] args) {        
        System.out.println("*** Cajero automatico ***");
        
        // Variable para pedir datos
        Scanner consola = new Scanner(System.in);
        
        // Variables del cajero
        double saldo = 1000.00;
        double monto = 0.0;
        boolean salir = false;
        
        while(!salir) {
            
            System.out.println("\nSelecciona una opción");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Salir");
            System.out.print("Escoge una opcion: ");
            int opcion = consola.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el monto a depositar: "); 
                    monto = Double.parseDouble(consola.nextLine());
                    saldo += monto;
                    System.out.printf("Se ha depositado $%.2f a tu cuenta.\n",saldo);
                    System.out.printf("Tu nuevo saldo es: $%.2f\n",saldo);
                    break;
                case 2:
                    System.out.print("Ingresa el monto a Retirar: "); 
                    monto = Double.parseDouble(consola.nextLine());
                    if(monto > saldo){
                        System.out.printf("No tienes saldo suficiente para retirar. Saldo Actual: $%.2f - Monto a retirar: $%.2f\n",saldo,monto);
                    } else {
                        saldo -= monto;
                        System.out.printf("Se ha retirado $%.2f de tu cuenta.\n",saldo);
                        System.out.printf("Tu nuevo saldo es: $%.2f\n",saldo);
                    }                                        
                    break;
                case 3:      
                    System.out.printf("Tu saldo actual es: $%.2f\n",saldo);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema de cajero automatico...");
                    salir = true;
                    break;
                default:
                    System.out.println("No se reonoce la operacion seleccionada.");
            }            
        }
    }
}
