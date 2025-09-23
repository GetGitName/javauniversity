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
public class DibujaTriangulo {
    public static void main(String[] args) {        
        System.out.println("*** Dibuja triangulo ***");
        
        Scanner consola = new Scanner(System.in);
        
        System.out.print("Proporciona el numero de filas: ");
        int filas = consola.nextInt();
        
        for (int fila = 1; fila <= filas; fila++) {
            String espaciosBlanco = " ".repeat(filas - fila);
            String asteriscos = "*".repeat(2*fila -1);
            System.out.println(espaciosBlanco+asteriscos);
        }
    }
}
