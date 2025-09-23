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
public class TiendaLinea {
    public static void main(String[] args) {        
        System.out.println("*** Tienda en linea con descuentos ***");
        // si ha comprado mas de 1000 y es miembro descuento del 10%
        //si solo es miembro de la tiende  5%
        // si noes miembro ni compro mas de 1000 descuento 0%
        Scanner consola = new Scanner(System.in);
        final double COMPRA_MINIMA = 1000.00;
        double descuento;
        String descuentoString;
        
        System.out.print("Cual fue el monto de tu compra?: ");
        double montoCompra = Double.parseDouble(consola.nextLine());
        
        System.out.print("Eres miembro de la tienda true/false?: ");
        boolean eresMiembro = Boolean.parseBoolean(consola.nextLine());
        
        if(montoCompra > COMPRA_MINIMA && eresMiembro){
            descuentoString = "10%";
            descuento = (10 / 100.0)*montoCompra;
        } else if(eresMiembro) {
            descuentoString = "5%";
            descuento = (5 / 100.0)*montoCompra;
        } else {
            descuentoString = "0%";
            descuento = 0.0;
        }
        
        if(descuento != 0){
            System.out.println("Felicidades, has obtenido un descuento del "+descuentoString);
        } else {
            System.out.println("No obtuviste descuento");
        }
        System.out.printf("Monto de la compra: $%.2f\n", montoCompra);
        System.out.printf("Monto del descuento: $%.2f\n", descuento);
        System.out.printf("Monto final de la compra con descuento: $%.2f\n",(montoCompra-descuento));
        
        
    }
}
