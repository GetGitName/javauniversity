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
public class ValidacionPasword {
    public static void main(String[] args) {        
        System.out.println("*** Cración y validación de password ***");
        
        // Variable para la solicitud de datos
        Scanner consola = new Scanner(System.in);
        
        // Variables para el sistema
        final int MAX_CAR_PASS = 6;
        boolean cumple = false;
        boolean esPasswordCorrecta = false;
        String passwordNueva;
        String passwordAValidar;
        
        // Solicitamos la nueva contraseña.
        while(!cumple){
            System.out.print("Ingresa tu nueva contraseña (debe tener al menos 6 caractetes: ");
            passwordNueva = consola.nextLine();
            
            if(passwordNueva.length() >= MAX_CAR_PASS){
                cumple = true;
                while(!esPasswordCorrecta) {
                    System.out.print("Ingresa tu pasword para validar: ");
                    passwordAValidar = consola.nextLine();
                    if(passwordAValidar.equals(passwordNueva)) {
                        esPasswordCorrecta = true;
                        System.out.println("Password Valido!!!!");
                    } 
                }
            }
        }
        
        
        
    }
}
