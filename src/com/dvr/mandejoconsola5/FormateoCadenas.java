/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.mandejoconsola5;

/**
 *
 * @author MB91491
 */
public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("*** Formateo de cadenas ***");
        String nombre = "Matias";
        int edad = 35;
        double salario  = 22020.30;
        
        //String format
        String mensaje = String.format("Nombre: %s, Edad: %d, Salario: %.2f", nombre, edad, salario);
        System.out.println(mensaje);
        
        // metodo printf
        System.out.printf("Nombre: %s, Edad: %d, Salario: %.2f%n", nombre, edad, salario);
        
        // Formato con text block
        int numeroEmpleado = 12;
        /*mensaje = """
                  %n Detalle Persona: \s
                  -----------------------
                  \tNombre: %s
                  """.formatted(nombre);*/
        
        System.out.println("Empleado: %04d".formatted(numeroEmpleado));
    }
}
