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
public class SistemaPrestamoLibros {
    public static void main(String[] args) {        
        System.out.println("*** Sistema prestamos de libros ***");
        final int DISTANCIA_PERMITIDA_KM = 3;
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Cuentas con credencial de estudianta true/fals?");
        boolean tienesCredencial = Boolean.parseBoolean(consola.nextLine());
        
        System.out.println("A cuantos km vives de la biblioteka? ");
        int distanciaBibliotekaKm = Integer.parseInt(consola.nextLine());
        
        boolean esElegiblePrestamo = tienesCredencial || distanciaBibliotekaKm <= DISTANCIA_PERMITIDA_KM;
        System.out.println("Eres elegible para prestamos de libors? = " + esElegiblePrestamo);
    }
}
