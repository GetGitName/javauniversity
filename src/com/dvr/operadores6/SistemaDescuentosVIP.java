/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.operadores6;

import java.util.Scanner;

/**
 *
 * @author MB91491
 */
public class SistemaDescuentosVIP {
    public static void main(String[] args) {        
        System.out.println("*** Sistema de descuentos VIP ***");
        final int NO_PRODUCTTOS_DESCUENTO = 10;
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Cuantos productos compraste hoy? ");
        int cantidadProductos = Integer.parseInt(consola.nextLine());
        
        System.out.println("Tienes la membresio de la tienda (true/false)?: ");
        boolean tieneMembresia = Boolean.parseBoolean(consola.nextLine());
        
        boolean esElegibleDescuento = cantidadProductos >= NO_PRODUCTTOS_DESCUENTO && tieneMembresia;
        System.out.println("Tienes acceso al descuento VIP? = " + esElegibleDescuento);
    }
}
