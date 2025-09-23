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
public class MenuIterativo {
    public static void main(String[] args) {        
        System.out.println("*** Menu Iterativo ***");
        //System.out.println("Menú");
        
        // Variable para capturar la opcion
        Scanner consola = new Scanner(System.in);
        int opcion;
        boolean salir = false;
        
        while(!salir){
            System.out.println("Menú");
            System.out.println("1. Crear cuenta: ");
            System.out.println("2. Eliminar cuenta: ");
            System.out.println("3. Salir");
            System.out.println();
            System.out.print("Escoge una opcion: ");
            opcion = Integer.parseInt(consola.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("Creando tu cuenta...");
                    break;
                case 2:
                    System.out.println("Eliminando tu cuenta...");
                    break;
                case 3:
                    System.out.println("Saliendo del sistema, hasta pronto!");
                    System.out.println("Fin del sistema de adminitracion de cuentas");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
        
        /*do {            
            System.out.println("1. Crear cuenta: ");
            System.out.println("2. Eliminar cuenta: ");
            System.out.println("3. Salir");
            System.out.println();
            System.out.print("Escoge una opcion: ");
            opcion = Integer.parseInt(consola.nextLine());
        } while (opcion != 3);
        System.out.println("Saliendo del sistema, hasta pronto \n");
        System.out.println("Saliendo del sistema administrador de cuentas.");*/
    }
}
