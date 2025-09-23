/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.archivos.presentacion;

import com.dvr.archivos.*;
import com.dvr.archivos.dominio.Snack;
import com.dvr.archivos.servicio.IServicioSnacks;
import com.dvr.archivos.servicio.ServicioSnacksArchivos;
import com.dvr.archivos.servicio.ServicioSnacksLista;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MB91491
 */
public class MaquinaSnacks {
    
    public static void main(String[] args) {        
        System.out.println("*** Maquina Snacks ***");
        maquinaSnacks();
    }
    
    public static void maquinaSnacks(){
        boolean salir = false;
        Scanner consola = new Scanner(System.in);
        
        // Creamos el objeto para obrtener el servicio de snacks
        //IServicioSnacks servicioSnacks = new ServicioSnacksLista();
        IServicioSnacks servicioSnacks = new ServicioSnacksArchivos();
        
        List<Snack> productos = new ArrayList<>();
        servicioSnacks.mostrarSnacks();
        
        while(!salir){
            try {
                int opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(opcion, consola, productos, servicioSnacks);
            } catch (Exception e) {
                System.out.println("Ocurrio un error: "+e);
            } finally {
                System.out.println();
            }            
        }
        
    }
    
    private static int mostrarMenu(Scanner consola){
        System.out.println("Menu:");
        System.out.println("1. Comprar Snack");
        System.out.println("2. Mostrar Ticket");
        System.out.println("3. Agregar nuevo snack");
        System.out.println("4. Inventario Snacks");
        System.out.println("5. Salir");
        System.out.print("Elige una opcion: ");
        return Integer.parseInt(consola.nextLine());
    }
    
    private static boolean ejecutarOpciones(int opcion, Scanner consola, List<Snack> productos, IServicioSnacks servicioSnacks){
        boolean salir = false;
            switch (opcion) {
            case 1:
                comprarSnack(consola, productos, servicioSnacks);
                break;
            case 2:
                mostrarTicket(productos);
                break;
            case 3:
                agregarSnack(consola, servicioSnacks);
                break;
            case 4:
                listarInventarioSnacks(consola, servicioSnacks);
                break;
            case 5:
                System.out.println("Regresa pronto");
                salir = true;
                break;
            default:
                System.out.println("Opcion invalida");
        }
        return salir;
    }
    
    private static void comprarSnack(Scanner consola, List<Snack> productos, IServicioSnacks servicioSnacks){
        System.out.println("Que Snack quieres comprar (id)?: ");
        int idSnack = Integer.parseInt(consola.nextLine());
        boolean snackEncontrado = false;
        for (Snack snack : servicioSnacks.getSnacks()) {
            if(idSnack == snack.getIdSnack()) {
                productos.add(snack);
                System.out.println("Ok, Snack agregado: "+snack);
                snackEncontrado = true;
                break;
            }
        }
        
        if(!snackEncontrado) {
            System.out.println("Id Snack no encontrado "+idSnack);
        }
    }
    
    private static void mostrarTicket(List<Snack> productos){
        
        String ticket = "*** Ticket de Venta ***";
        double total = 0.0;
        
        for (Snack producto : productos) {
            ticket += "\n\t- "+producto.getNombre() + " - $"+producto.getPrecio();
            total += producto.getPrecio();
        }
        
        ticket += "\n\tTotal -> $"+total;
        System.out.println(ticket);
        
    }
    
    private static void agregarSnack(Scanner consola, IServicioSnacks servicioSnacks){
        System.out.print("Nombre del snack: ");
        String nombre = consola.nextLine();
        System.out.print("Presio Snack: ");
        double precio = Double.parseDouble(consola.nextLine());
        servicioSnacks.agregarSnack(new Snack(nombre, precio));
        System.out.println("Tu Snack se ha agregado correctamente!");
        servicioSnacks.mostrarSnacks();
    }
    
    private static void listarInventarioSnacks(Scanner consola, IServicioSnacks servicioSnacks) {
        servicioSnacks.mostrarSnacks();
    }
    
}
