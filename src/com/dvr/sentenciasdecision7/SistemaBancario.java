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
public class SistemaBancario {
    public static void main(String[] args) {        
        System.out.println("*** Sistema Bancario ***");
        Scanner consola = new Scanner(System.in);
        
        System.out.print("Desdeas salir del sistema true/false: ");
        boolean salirSistema = Boolean.parseBoolean(consola.nextLine());
        
        // Verificamos aplicando una logica inversa
        if(!salirSistema) {
            System.out.println("Continuamos dentro del sistema...");            
        } else 
            System.out.println("Saliendo del sistema...");
    }
}
