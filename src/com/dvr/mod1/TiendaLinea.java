/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.mod1;

/**
 *
 * @author MB91491
 */
public class TiendaLinea {
    
    public static void main(String[] args) {
        // Detalle del producto
        System.out.println("*** Tienda en linea (Detalle producto) ***");
        String nombreProducto = "Laptop HP";
        double precioProducto = 1000.50;
        int cantidadDisponibl = 15;
        boolean disponibleVenta = true;
        
        //imprimir las variables
        System.out.println("Nombre producto: "+nombreProducto);
        System.out.println("Precio: "+precioProducto);
        System.out.println("Cantidad diponivble: "+cantidadDisponibl);
        System.out.println("Disponible: "+disponibleVenta);
        
        // Actualizacion de los datos
        nombreProducto = "Laptop Dell";
        precioProducto = 1050.50;
        cantidadDisponibl = 0;
        disponibleVenta = false;
        
        //imprimir las variables
        System.out.println();
        System.out.println("Nombre producto: "+nombreProducto);
        System.out.println("Precio: "+precioProducto);
        System.out.println("Cantidad diponivble: "+cantidadDisponibl);
        System.out.println("Disponible: "+disponibleVenta);
    }
    
}
