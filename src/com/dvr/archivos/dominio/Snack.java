/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.archivos.dominio;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author MB91491
 */
public class Snack implements Serializable{
    
    private static int contadorSnacks = 0;
    private int idSnack;
    private String nombre;
    private double precio;

    public Snack(){
        this.idSnack = ++Snack.contadorSnacks;
    }
    
    public Snack(String nombre, double precio) {        
        this(); // debe de ser la primer linea la llamada al consturctor
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Snack{" + "idSnack=" + idSnack + ", nombre=" + nombre + ", precio=" + precio + '}';
    }    

    public static int getContadorSnacks() {
        return contadorSnacks;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Snack snack = (Snack)obj;
        return idSnack == snack.idSnack && Double.compare(precio, snack.precio) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSnack,nombre,precio);
    }

    public int getIdSnack() {
        return idSnack;
    }
    
    public String escribirSnack(){
        return idSnack + "," + nombre + "," + precio;
    }
}
