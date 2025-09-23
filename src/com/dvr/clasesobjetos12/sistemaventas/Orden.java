/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.clasesobjetos12.sistemaventas;

/**
 *
 * @author MB91491
 */
public class Orden {
    
    private Producto[] productos;
    private static double total = 0;
    private final int idOrden;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    private static int contadorOrdenes;
    
    public Orden(){
        
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
        
    }
    
    public void agregarProducto(Producto producto) {
        if(this.contadorProductos < Orden.MAX_PRODUCTOS){
            this.productos[contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el máximo de productos: "+Orden.MAX_PRODUCTOS);
        }
    }
    
    private double calcularTotal(){
        double t = 0;
        for(int i = 0; i < contadorProductos;i++){
            Producto producto = this.productos[i];
            total += producto.getPrecio();
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("ID Orden: "+this.idOrden);
        double to = this.calcularTotal();
        System.out.println("\tTotal de la Orden: $"+to);
        System.out.println("\tProductos de la Orden: ");
        for(int i = 0; i <this.contadorProductos; i++) {
            System.out.println("\t\t"+this.productos[i]);
        }
    }
}
