/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.operadores6;

import java.util.Scanner;

/**
 *
 * @author MB91491
 */
public class SistemaAutenticacion {
    public static void main(String[] args) {        
        System.out.println("*** Sistema de autentieción ***");
        final String USUARIO_CORRECTO = "daniel";
        final String PASSWORD_CORRECTO = ".2025d";
        Scanner consola = new Scanner(System.in);
        
        System.out.print("Cual es tu usuario?: ");
        String usuario = consola.nextLine();
        
        System.out.print("Cual es tu password?: ");
        String password = consola.nextLine();
        
        boolean sonCredencialesCorrectas = usuario.equals(USUARIO_CORRECTO) && password.equals(PASSWORD_CORRECTO);
        System.out.println("Datos son correctos? "+sonCredencialesCorrectas);
    }
}
