/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.mod1;

/**
 *
 * @author MB91491
 */
public class ReservaHotel {
    
    public static void main(String[] args) {
        System.out.println("*** RESERVA DE HOTEL ***");
        
        //Definicion de variables        
        String nombreCliente = "daniel";
        int diasEstancia = 3;
        double tarifa = 242.21;
        boolean tieneVistaAlMar = true;
        
        // Imprimir variables
        System.out.println("Cliente: "+nombreCliente);
        System.out.println("Dias de estancia: "+diasEstancia);
        System.out.println("Tarifa: "+tarifa);
        System.out.println("Con vista al mar: "+tieneVistaAlMar);
        
        // Modificamos algunos valores        
        diasEstancia = 4;
        tarifa = 142.21;
        tieneVistaAlMar = false;
        
        // Imprimir variables
        System.out.println();
        System.out.println("Nuevos datos de reservacion-------");
        System.out.println("Cliente: "+nombreCliente);
        System.out.println("Dias de estancia: "+diasEstancia);
        System.out.println("Tarifa: "+tarifa);
        System.out.println("Con vista al mar: "+tieneVistaAlMar);        
    }
        
    
}
