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
public class ValidacionPaswordV2 {
    public static void main(String[] args) {        
        
        Scanner consola = new Scanner(System.in);
        System.out.println("*** Validacion de password ***");
        
        System.out.print("Ingresa un password (de al menos 6 caracteres)");
        String password = consola.nextLine();
        
        //Validamos password
        while(password.length() < 6){
            System.out.println("El password no cumple con los requieitos, debe de tener al menos 6 caracateres.");
            System.out.print("Ingresa un nuevo valor de password: ");
            password = consola.nextLine();
        }
        
        System.out.println("El valor del password es valid.");

    }
}
