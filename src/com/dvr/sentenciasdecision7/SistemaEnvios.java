/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.sentenciasdecision7;

import java.util.Scanner;

/**
 *
 * @author MB91491
 */
public class SistemaEnvios {
    public static void main(String[] args) {        
        System.out.println("*** Sistema de envios ***");
        
        // Constantes
        final double COSTO_TARIFA_NACIONAL = 10.0;
        final double COSTO_TARIFA_INTERNACIONAL = 20.0;
        
        // Variable para pedir datos
        Scanner consola = new Scanner(System.in);
        
        // Peticion de datos al usuario
        System.out.print("Destion nacional o internacional: ");
        String destino = consola.nextLine().strip().toLowerCase();
        
        System.out.print("Peso en Kilogramos: ");
        double pesoKilos = Double.parseDouble(consola.nextLine());
        
        // Calculamos el costo
        double costoEnvio;
        
        switch (destino) {
            case "nacional":
                costoEnvio = pesoKilos * COSTO_TARIFA_NACIONAL;
                break;
            case "internacional":
                costoEnvio = pesoKilos * COSTO_TARIFA_INTERNACIONAL;
                break;
            default:
                costoEnvio = 0.0;
                break;
        }
        
        System.out.printf("El envio del paquete de %.2f kilos es: $%.2f\n",pesoKilos,costoEnvio);
    }
}
