/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.mod1;

/**
 *
 * @author MB91491
 */
public class DetalleLibro {
    public static void main(String[] args) {
        
        // Detalle de un libro
        String tituloLibro = "El señor de los anillos";
        int anioPublicacion = 1954;
        boolean libroDisponible = true;
        double precio = 500.50;
        
        // Imprimir el valor de las variables
        System.out.println(tituloLibro);
        System.out.println(anioPublicacion);
        System.out.println(libroDisponible);
        System.out.println(precio);
        
        //Modificar el titulo dellibro
        tituloLibro = "El Señor de los Anillos";
        System.out.println(tituloLibro);
        
    }
}
