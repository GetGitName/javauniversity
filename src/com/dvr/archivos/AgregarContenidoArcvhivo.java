/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author MB91491
 */
public class AgregarContenidoArcvhivo {
    public static void main(String[] args) {
        
        boolean anexar = false;
        String nombreArchivo = "mi_archivo.txt";
        File archivo = new File(nombreArchivo);
        try {
            anexar = archivo.exists();
            PrintWriter salida = new PrintWriter(new FileWriter(archivo,anexar));
            String nuevoContenido = "Nuevo\ncontenido";
            salida.println(nuevoContenido);
            salida.close();
            System.out.println("Se agrego contenido al archivo.");
        } catch (Exception e) { 
            System.out.println("Error al abrir el archivo");
        } finally {
            System.out.println("fd");
        }
        
    }
}
