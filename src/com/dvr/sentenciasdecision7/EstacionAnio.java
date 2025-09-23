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
public class EstacionAnio {
    public static void main(String[] args) {        
        System.out.println("*** Identifica la estacion del año ***");
        
        // Solicitamos informacion al usuario
        Scanner consola = new Scanner(System.in);
        
        System.out.println("\tNo. \tMes");
        System.out.println("\t1 \tEnero");
        System.out.println("\t2 \tFebrero");
        System.out.println("\t3 \tMarzo");
        System.out.println("\t4 \tAbril");
        System.out.println("\t5 \tMayo");
        System.out.println("\t6 \tJunio");
        System.out.println("\t7 \tJulio");
        System.out.println("\t8 \tAgosto");
        System.out.println("\t9 \tSeptiembre");
        System.out.println("\t10 \tOctubre");
        System.out.println("\t11 \tNoviembre");
        System.out.println("\t12 \tDiciembre");
        System.out.print("Selecciona un mes con numero: ");
        int mes = Integer.parseInt(consola.nextLine());
        String estacion;
        
        // Validamos el rango
        if(mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        } else if(mes >=3 && mes <=5) {
            estacion = "Primavera";
        } else if(mes >=6 && mes <=8) {
            estacion = "Verano";
        } else if(mes >=9 && mes <=11) {
            estacion = "Otoño";
        } else {
            estacion = "Estación desconocida";
        }
        
        // imprimimos la esacion
        System.out.println("La estacion del año es "+estacion);
                
    }
}
