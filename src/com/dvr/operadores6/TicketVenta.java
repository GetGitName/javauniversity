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
public class TicketVenta {
    public static void main(String[] args) {        
        System.out.println("*** Generacion ticketVenta ***");
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Precio leche: ");
        double precioLeche = Double.parseDouble(consola.nextLine());
        
        System.out.println("Precio pan: ");
        double precioPan = Double.parseDouble(consola.nextLine());
        
        System.out.println("Precio lechuga: ");
        double precioLechuga = Double.parseDouble(consola.nextLine());
        
        System.out.println("Precio platano: ");
        double precioPlatanos = Double.parseDouble(consola.nextLine());
        
        System.out.println("Aplicar algun descuento (%)?: ");
        int descuentoPorcentaje = Integer.parseInt(consola.nextLine());
        
        // calcular el subtotal sin impuestos
        double subtotal = precioLeche + precioLechuga+precioPan+precioPlatanos;
        
        // Calculo con impuestos
        double impuesto = subtotal * 0.16;
        
        // Aplicar descuento
        double descuento = subtotal * (descuentoPorcentaje/100.0);
        
        //subtotal desceunto
        double subtotalDescuento = subtotal - descuento;
        
        // Calculo total de la compra con impuestos
        double costoTotalCompra = subtotalDescuento + impuesto;
        
        // imprimir el ticket de venta
        System.out.println("Ticket de Venta");
        System.out.println("-----------------------------");
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Descuento: $%.2f (%d%%)\n",descuento,descuentoPorcentaje);
        System.out.printf("Impuesto (16%%):$%.2f\n", impuesto);
        System.out.printf("Costo total de la compra: $%.2f\n", costoTotalCompra);
        
        
    }
}
