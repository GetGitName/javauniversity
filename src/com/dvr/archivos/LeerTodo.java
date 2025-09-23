/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.archivos;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author MB91491
 */
public class LeerTodo {
    public static void main(String[] args) {
        String nombreArchivo = "mi_archivo.txt";
        
        try {
            // Leer todas las lineas de archivo
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
            System.out.println("Contenido del archivo");
            for (String linea : lineas) {
                System.out.println(linea);
            }
            lineas.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
