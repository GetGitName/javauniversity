/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.mod4.cadenas;

/**
 *
 * @author MB91491
 */
public class GeneradorEmail {
    public static void main(String[] args) {
        // Programa para generar email
        System.out.println("*** Generador de Email ***");
        
        //Declaracion de variables
        String nombre = " Daniel Valdez Ramirez ";
        String empresa = "iTechInnova";        
        String extensionDominio = ".com";
        String nombreNormalizado;
        String empresaNormalizado;
        String dominioEmailNormalizado = "";
        StringBuilder email = new StringBuilder();
        
        // Pasos para la normalizacion de datos
        // 1.- Convertir toda la cadena a minusculas
        nombreNormalizado = nombre.strip().toLowerCase();
        empresaNormalizado = empresa.toLowerCase();
        // 2.- Reemplazar espacios por nada
        nombreNormalizado = nombreNormalizado.replace(' ', '.');
        // 3.- Crear dominio
        dominioEmailNormalizado = dominioEmailNormalizado.concat("@").concat(empresaNormalizado).concat(extensionDominio);
        // 4.- Generar email
        email.append(nombreNormalizado).append(dominioEmailNormalizado);
        
        // Imprimir resultados
        System.out.println("Nombre usuario: "+nombre);
        System.out.println("Nombre usuario normalizado: "+nombreNormalizado);
        System.out.println();
        System.out.println("Nombre empresa: "+empresa);
        System.out.println("Extensión del dominio: "+extensionDominio);
        System.out.println("Dominio de email normalizado "+dominioEmailNormalizado);
        System.out.println();
        System.out.println("Email generado: ".concat(email.toString()));
        
    }
}
