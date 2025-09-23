/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.temasavanzados.maquinasnaks;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MB91491
 */
public class Snacks {
    
    private static final List<Snack> snacks;
    
    // Bloque static inicializador
    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papas", 70));
        snacks.add(new Snack("Refresco", 50));
        snacks.add(new Snack("Sandwitch", 120));
    }
    
    public static void agregarSnack (Snack snack){
        snacks.add(snack);
    }
    
    public static void mostrarSnacks(){
        String inventarioSnacks = "";
        for (Snack snack : snacks) {
            inventarioSnacks += snack.toString()+"\n";
        }
        System.out.println("--- Snacks ene l inventario ---");
        System.out.println(inventarioSnacks);
    }
    
    public static List<Snack> getSnacks(){
        return snacks;
    }
}
