/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.mandejoconsola5;

import com.sun.xml.internal.stream.Entity;
import java.util.Scanner;

/**
 *
 * @author MB91491
 */
public class ManejoConsola {
    public static void main(String[] args) {
        // Introducir valores consola        
        Scanner consola = new Scanner(System.in); // in - input -entrada de datos
        System.out.print("Escribe tu nombre: ");
        String nombre = consola.nextLine();
        System.out.println("Nombre: "+nombre);
    }
}
