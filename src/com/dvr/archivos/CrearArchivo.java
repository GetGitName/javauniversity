/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MB91491
 */
public class CrearArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "mi_archivo.txt";
        File archivo = new File(nombreArchivo);
        
        if(archivo.exists()){
            System.out.println("El archivo ya existe");            
        } else {
            try {
                // creamos archivo
                PrintWriter pw = new PrintWriter(new FileWriter(archivo));
                pw.close();
                System.out.println("Se ha creado el archivo");
            } catch (IOException ex) {
                Logger.getLogger(CrearArchivo.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            }
        }
    }
}
