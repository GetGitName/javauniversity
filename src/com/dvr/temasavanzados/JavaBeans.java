/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.temasavanzados;

import java.io.Serializable;

/**
 *
 * @author MB91491
 */
public class JavaBeans {
    public static void main(String[] args) {        
        System.out.println("*** Java beans ***");
        Persona persona = new Persona();
        persona.setApellido("Valdez");
        persona.setNombre("daniel");
        System.out.println("persona = " + persona);
    }
}

class Persona implements Serializable{
    
    private String nombre;
    private String apellido;
    public Persona(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }    
    
}
