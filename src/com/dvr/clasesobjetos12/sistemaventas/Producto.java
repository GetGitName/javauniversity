/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.clasesobjetos12.sistemaventas;

/**
 *
 * @author MB91491
 */
public class Producto {
    
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        idProducto = ++contadorProductos;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }
    
    @Override
    public String toString(){        
        return "Producto{idProducto="+idProducto+", nombre="+nombre+", precio="+precio+"}";
    }
    
}
