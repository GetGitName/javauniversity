/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.temasavanzados;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author MB91491
 */
public class Mapa {
    public static void main(String[] args) {        
        System.out.println("*** Mapa ***");
        Map<String, String> persona = new HashMap<>();
        persona.put("nombre", "daniel");
        persona.put("apellido", "valdez");
        persona.put("edad", "31");
        
        System.out.println("Valores del mapa");
        
        persona.entrySet().forEach(System.out::println);
        
        persona.put("edad", "35");
        
        System.out.println("Nuevos Valores del mapa");
        
        persona.entrySet().forEach(System.out::println);
        
        System.out.println("Iterar por separado");
        persona.forEach((llave, valor) -> {
            System.out.println("llave: "+llave + " valor: "+valor);
        });
    }
}
