/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.matrices10;

import java.util.Scanner;

/**
 *
 * @author MB91491
 */
public class ValoresDinamicos {
    public static void main(String[] args) {        
        System.out.println("*** Matrices con valores dinamicos ***");
        
        Scanner consola = new Scanner(System.in);
        
        int renglones, columnas;
        int[][] matriz;
        
        // definir matriz
        System.out.print("Proporciona los renglones: ");
        renglones = consola.nextInt();
        System.out.print("Proporciona las columnas: ");
        columnas = consola.nextInt();
        
        // creamos tamaño de matriz
        matriz = new int[renglones][columnas];
        
        //solicitar valores
        for (int ren = 0; ren < renglones; ren++) {
            for (int col = 0; col < columnas; col++) {
                System.out.print("Valor["+ren+"]["+col+"]: ");
                matriz[ren][col] = consola.nextInt();
            }
        }
        
        // imprimimos la matriz
        for (int ren = 0; ren < renglones; ren++) {
            for (int col = 0; col < columnas; col++) {
                System.out.println("Matriz["+ren+"]["+col+"]: "+matriz[ren][col]);
            }
        }
    }
            
}
