/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.mod4.cadenas;

/**
 *
 * @author MB91491
 */
public class BusquedaSubcadenas {
    public static void main(String[] args) {
        // Buscar subcadenas
        //indexOf - devuelve el indice de la primera aparicion de la subcadena
        String cadena = "hola mundo";
        // Subcadena a buscar "Hola"
        int indice = cadena.indexOf("hola");
        System.out.println("indece = "+indice);
        // lastindexof - devuelve el indice de la ultima aparicion de la subcadena
        // Subcadena de mundo
        int indice2 = cadena.lastIndexOf("mundo");
        System.out.println("indice2 "+indice2);
        
        //subcadena no encontrada devuelve -1
        int indice3 = cadena.indexOf("java");
        System.out.println(indice3);
        
    }
}
