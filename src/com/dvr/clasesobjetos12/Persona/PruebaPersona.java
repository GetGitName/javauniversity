/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.clasesobjetos12.Persona;

/**
 *
 * @author MB91491
 */
public class PruebaPersona {
    public static void main(String[] args) {        
        System.out.println("*** Prueba persona ***");
        
        System.out.println("Variable estatica: "+Persona.getContadorPersonas());
        
        Persona p1 = new Persona("Daniel", "Valdez");
        p1.mostrarNombre();
        p1.setNombre(p1.getNombre().concat(" lol"));
        p1.mostrarNombre();
        
        System.out.println("Sobreescrubiendo tostring");
        System.out.println(p1.toString());
        System.out.println(p1);
        
        Persona p2 = new Persona("Daniel", "Valdezfdsfs");
        System.out.println("Variable estatica "+Persona.getContadorPersonas());
        System.out.println(p2);
    }
}
