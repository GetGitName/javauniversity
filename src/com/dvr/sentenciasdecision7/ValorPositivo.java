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
public class ValorPositivo {
    public static void main(String[] args) {        
        System.out.println("*** Valor positivo ***");
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Ingresa un numero ");
        int numero = Integer.parseInt(consola.nextLine());
        
        if(numero > 0){
            System.out.println("Es positivo "+numero);
        } else if(numero < 0){
            System.out.println("Es negativo"+numero);
        } else {
            System.out.println("es 0"+numero);
        }    
    }
}
