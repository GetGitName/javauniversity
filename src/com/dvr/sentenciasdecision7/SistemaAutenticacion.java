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
public class SistemaAutenticacion {
    public static void main(String[] args) {        
        System.out.println("*** Sistema de autenticacion ***");
        
        // Constantes
        final String USUARIO_VALIDO = "daniel";
        final String PASSWORD_VALIDO = "dvr2025";
        
        // Variable para pedir datos al usuario
        Scanner consola = new Scanner(System.in);
        
        // Solicitar datos al usuario
        System.out.print("Ingresa tu usuario: ");
        String usuarioIngresado = consola.nextLine().strip();
        
        System.out.print("Ingresa tu password: ");
        String passwordIngresado = consola.nextLine().strip();
        
        // Validamos los casos
        if(USUARIO_VALIDO.equals(usuarioIngresado) && PASSWORD_VALIDO.equals(passwordIngresado)){
            System.out.println("Bienvenido al sistema!");
        } else if(!USUARIO_VALIDO.equals(usuarioIngresado) && PASSWORD_VALIDO.equals(passwordIngresado)){
            System.out.println("Usuario invalido, favor de corregirlo!!");
        } else if(USUARIO_VALIDO.equals(usuarioIngresado) && !PASSWORD_VALIDO.equals(passwordIngresado)){
            System.out.println("Password invalido, favor de corregirlo!!");
        } else {
            System.out.println("Usuario y password invalidos.");
        }
    }
}
