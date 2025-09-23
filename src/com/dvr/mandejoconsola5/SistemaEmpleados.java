/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.mandejoconsola5;

import java.util.Scanner;

/**
 *
 * @author MB91491
 */
public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("*** SISTEMA DE EMPLEADOS ***");
        
        Scanner consola = new Scanner(System.in);
        
        //nombre de empleado
        System.out.print("Nombre del empleado: ");
        String nombreEmpleado = consola.nextLine();
        
        //Edad del empleado
        System.out.println("Edad del empleado");
        int edadEmpleado = Integer.parseInt(consola.nextLine());
        
        //Salario enmpleado
        System.out.println("Salario de empleado");
        double salarioEmpleado = Double.parseDouble(consola.nextLine());
        
        // Es jefe de deoartamento
        System.out.println("Es jefe de departamento (true/false)?");
        boolean esJefeDepartamento = Boolean.parseBoolean(consola.nextLine());
        
        // Improimir valores del empleado
        System.out.println("\nDatos del empleado: ");
        System.out.println("\tNombre: "+nombreEmpleado);
        System.out.println("\tEdad: "+edadEmpleado+" años");
        //System.out.println("\tSalario: "+salarioEmpleado);
        System.out.println("\tSalario: $ %.2f%n".formatted(salarioEmpleado));
        System.out.println("\tEs jefe de departamento? "+esJefeDepartamento);
    }
}
