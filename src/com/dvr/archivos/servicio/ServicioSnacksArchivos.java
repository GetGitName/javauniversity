/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.archivos.servicio;

import com.dvr.archivos.dominio.Snack;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author MB91491
 */
public class ServicioSnacksArchivos implements IServicioSnacks {

    private final String NOMBRE_ARCHIVO = "snacks.txt";
    // Crear la lista de snacks
    private List<Snack> snacks = new ArrayList<>();
    
    // constructor de la clase
    public ServicioSnacksArchivos() {
        
        // Creamos el archivo si no existe
        File archivo = new File(NOMBRE_ARCHIVO);
        boolean existe = false;
        try {
            existe = archivo.exists();
            if(existe) {
                this.snacks = obtenerSnacks();
            } else {
                PrintWriter salida = new PrintWriter(new FileWriter(archivo));
                System.out.println("Se ha creado el archivo");
            }
        } catch (Exception e) {
            System.out.println("Error al cargar el archivo: "+e.getMessage());
        }
        
        // Si no existe, cargamos algunos snacks iniciales
        if(!existe){
            cargarSnacksIniciales();
        }
        
    }
    
    
    @Override
    public void agregarSnack(Snack snack) {
        // Agregamos el nuevo snack
        // 1.- Se guarda en la lista en memoria
        this.snacks.add(snack);
        // 2.- Guardamos el nuevo snacl en el archivo
        this.agregarSnackArchivo(snack);
    }

    @Override
    public void mostrarSnacks() {
        System.out.println("--- Snacks en el inventario ---");
        // Mostramos la lista de snacks en el archivo
        String inventarioSnacks = "";
        for (Snack snack : snacks) {
            inventarioSnacks += snack.toString() + "\n";
        }
        
        System.out.println(inventarioSnacks);
    }

    @Override
    public List<Snack> getSnacks() {
        return this.snacks;
    }
    
    private void cargarSnacksIniciales() {
        this.agregarSnack(new Snack("Papas", 70));
        this.agregarSnack(new Snack("Refresco", 50));
        this.agregarSnack(new Snack("Sandwich", 120));
    }
    
    private void agregarSnackArchivo(Snack snack){
        boolean anexar = false;
        File archivo = new File (NOMBRE_ARCHIVO);
        try {
            anexar = archivo.exists();
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(snack.escribirSnack());
            salida.close();
        } catch (Exception e) {
            System.out.println("Error al agregar snack "+e.getMessage());
        }
    }
    
    private List<Snack> obtenerSnacks() {
        List snacks = new ArrayList<Snack>();
        try {
            List<String> lineas = Files.readAllLines(Paths.get(NOMBRE_ARCHIVO));
            for (String linea : lineas) {
                String[] lineaSnack = linea.split(",");
                String idSnack = lineaSnack[0];
                String nombre = lineaSnack[1];
                String precio = lineaSnack[2];
                Snack snack = new Snack(nombre, Double.parseDouble(precio));
                snacks.add(snack); // Agregamos el snack leido a la lista
            }
        } catch (Exception e) {
            System.out.println("Error al leer archivo de snacks "+e.getMessage());
            e.printStackTrace();
        }
        
        return snacks;
    }
    
}
