/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.temasavanzados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author MB91491
 */
public class Listas {
    public static void main(String[] args) {        
        System.out.println("*** Listas ***");
        List<String> miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("MArtes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        
        for (String object : miLista) {
            System.out.println("Elemento "+object);
        }
        
        //Lambda funciona anonima
        miLista.forEach(elemento -> {
            System.out.println("Elemento FE "+elemento);
        });
        
        miLista.forEach(System.out::println);
        
        List<String> nombres = Arrays.asList("N2","nre","3rer");
        nombres.forEach(System.out::println);
    }
}
