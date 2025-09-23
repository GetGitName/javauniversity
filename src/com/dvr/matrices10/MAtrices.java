/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.matrices10;

/**
 *
 * @author MB91491
 */
public class MAtrices {
    public static void main(String[] args) {        
        System.out.println("*** MAtrices ***");
        
        int[][] matriz = {
            {100,200,300},
            {400,500,600},
        };
        
        // Definimos la matriz
        final int RENGLONES = 2;
        final int COLUMNAS = 3;
        
        int[][] matriz2 = new int[RENGLONES][COLUMNAS];
        
        // Modificar los valores de la matriz
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;
        
        //System.out.println("Valor 1 [0][0] "+matriz[0][0]);
        //System.out.println("Valor 5 [1][1] "+matriz[1][1]);
        //System.out.println("Valor 6 [1][1] "+matriz[1][2]);
        
        // rECORRER UNA MATRIZ renglones
        for (int ren = 0; ren < RENGLONES; ren++) {
            // ciclo interno para columnas
            for (int col = 0; col < COLUMNAS; col++) {
                System.out.println("Valor["+ren+"]["+col+"]= "+matriz[ren][col]);
            }
        }
        
    }
}
