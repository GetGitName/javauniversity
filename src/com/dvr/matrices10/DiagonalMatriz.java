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
public class DiagonalMatriz {
    public static void main(String[] args) {        
        System.out.println("*** Suma de la diagonal de una matriz ***");
        
        //variables
        Scanner consola = new Scanner(System.in);
        int renglones, columnas, sumaDiagonal;
        int[][] matriz;
        
        // Solicitamos tamaño de matriz
        System.out.print("Introduce los renglones de la matriz: ");
        renglones = consola.nextInt();
        System.out.print("Introduce las columnas de la matriz: ");
        columnas = consola.nextInt();
        
        matriz = new int[renglones][columnas];
        
        // solicitamos los valores para la matriz
        for (int ren = 0; ren < renglones; ren++) {
            for (int col = 0; col < columnas; col++) {
                System.out.print("Valor["+ren+"]["+col+"]: ");
                matriz[ren][col] = consola.nextInt();
            }
        }
        
        // Recorremos para realizar la suma
        sumaDiagonal = 0;
        for (int ren = 0; ren < renglones; ren++) {
            for (int col = 0; col < columnas; col++) {
                if(ren == col){
                    sumaDiagonal += matriz[ren][col];
                }
            }
        }
        
        System.out.println("\n La suma de la diagonal es: "+sumaDiagonal);
    }
}
