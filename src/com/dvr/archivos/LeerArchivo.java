/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MB91491
 */
public class LeerArchivo {
    public static void main(String[] args) {
        // Leer archivo
        String miArchivo = "mi_archivo.txt";
        File archivo = new File(miArchivo);
        System.out.println("Contenido del archivo");
        try {
            //Abrir el archivo para su lectura
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            //Leemos linea a linea el archivo
            String linea = entrada.readLine();
            //Leemos todas las lineas
            while(linea != null){
                System.out.println(linea);
                //  antes de terminar el ciclo nos movemos a la slguiente linea
                linea = entrada.readLine();
            }
            // Cerramos el archivo
            entrada.close();
        } catch (Exception ex) {
            Logger.getLogger(LeerArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
