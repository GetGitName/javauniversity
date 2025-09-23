/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.clasesobjetos12.sistemaventas;

/**
 *
 * @author MB91491
 */
public class Ventas {
    public static void main(String[] args) {        
        System.out.println("*** Sistema de ventas ***");
        
        Producto producto1 = new Producto("Blusa", 30);
        //System.out.println(producto1);
        Producto producto2 = new Producto("Zapatos", 50);
        //System.out.println(producto2);
        
        Orden orden = new Orden();
        orden.agregarProducto(producto1);
        orden.agregarProducto(producto2);
        
        orden.mostrarOrden();
        
        Orden orden2 = new Orden();
        orden2.agregarProducto(new Producto("Playera", 15));
        orden2.agregarProducto(new Producto("sudadera", 54));
        producto1.setNombre("Daniel");
        producto1.setPrecio(500);
        orden2.agregarProducto(producto1);
        orden2.mostrarOrden();
    }
}
