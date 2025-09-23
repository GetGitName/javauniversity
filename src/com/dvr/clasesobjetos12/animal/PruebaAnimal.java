/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.clasesobjetos12.animal;

/**
 *
 * @author MB91491
 */
public class PruebaAnimal {
    public static void main(String[] args) {        
        System.out.println("*** Ejemplo de herencia ***");
        System.out.println("Clase Padre, soy un animal");
        Animal a1 = new Animal();
        a1.comer();
        a1.dormir();
        System.out.println("\n Clse hija soy un perro");
        Perro p1 = new Perro();
        p1.comer();
        p1.dormir();
        p1.hacerSonido();
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("*** Ejemplo de polimorfismo ***");
        Animal a2 =  new Perro();
        
        imprimirSonido(a2);
        
        Animal a3 =  new Gato();
        
        imprimirSonido(a3);
    }
    
    //Metodo Polimorfico
    public static void imprimirSonido(Animal a){        
        a.hacerSonido();
    }
}


