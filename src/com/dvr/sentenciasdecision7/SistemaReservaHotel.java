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
public class SistemaReservaHotel {
    public static void main(String[] args) {        
        System.out.println("*** Sistema de reserva de hotel ***");
        
        //Constantes
        final double TARIFA_CON_VISTA_MAR = 190.50;
        final double TARIFA_SIN_VISTA_MAR = 150.50;
        
        // Pedir datos al usuario
        Scanner consola = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        String nombre = consola.nextLine();
        
        System.out.print("Cuantos días de estadía estarás?: ");
        int diasEstadia = Integer.parseInt(consola.nextLine());
        
        System.out.print("Cuarto con vista al mar true/false?: ");
        boolean conVistaAlMar = Boolean.parseBoolean(consola.nextLine());                   
        
        // Calculamos el costo dependiendo si es con vista al mar o no
        double costoEstadia = (conVistaAlMar) ? diasEstadia * TARIFA_CON_VISTA_MAR : diasEstadia * TARIFA_SIN_VISTA_MAR;
        
        System.out.println("\n ---------------- Detalles de la reservacion ---------------- ");
        System.out.printf("Cliente: %s\n", nombre);
        System.out.printf("Dias de estadia: %d\n", diasEstadia);
        System.out.printf("Costo total: $%.2f\n", costoEstadia);
        System.out.printf("Habitación con vista al mar: %s\n", (conVistaAlMar) ? "Sí :D" : "No :(");
    }
}
