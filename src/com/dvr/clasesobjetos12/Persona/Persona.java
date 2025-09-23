/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.clasesobjetos12.Persona;

/**
 *
 * @author MB91491
 */
public class Persona {
    
    private String nombre;
    private String apellid;
    private static int contadorPersonas = 0;
    private int idPersona;
            
    public Persona(String nombre, String apellid) {
        this.nombre = nombre;
        this.apellid = apellid;
        //Persona.contadorPersonas++;
        this.idPersona = ++Persona.contadorPersonas; // Preincremento
    }    
    
    public void mostrarNombre(){
        System.out.println("Nombre "+nombre);
        System.out.println("Apellido "+apellid);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellid() {
        return apellid;
    }

    public void setApellid(String apellid) {
        this.apellid = apellid;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }
    
    
    
    public static void main(String[] args) {        
        /*System.out.println("*** Objetos ***");
        Persona persona = new Persona();
        persona.nombre = "DAniel";
        persona.apellid = "Valdez";
        persona.mostrarNombre();
        
        System.out.println();
        System.out.println("Persona 2");
        System.out.println();
        
        Persona persona2 = new Persona();
        persona2.nombre  = "lia";
        persona2.apellid = "fores";
        persona2.mostrarNombre();*/
    }

    @Override
    public String toString() {
        return "Nombre: "+this.nombre+", Apellido: "+this.apellid+"Contador: "+contadorPersonas+", IDPersona: "+idPersona+" padre: "+super.toString();
    }
    
    
    
}
