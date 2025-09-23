/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.archivos.servicio;

import com.dvr.archivos.dominio.Snack;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MB91491
 */
public class ServicioSnacksLista implements IServicioSnacks {
    
    private static final List<Snack> snacks;
    
    // Bloque static inicializador
    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papas", 70));
        snacks.add(new Snack("Refresco", 50));
        snacks.add(new Snack("Sandwitch", 120));
    }
    
    @Override
    public void agregarSnack (Snack snack){
        snacks.add(snack);
    }
    
    @Override
    public void mostrarSnacks(){
        String inventarioSnacks = "";
        for (Snack snack : snacks) {
            inventarioSnacks += snack.toString()+"\n";
        }
        System.out.println("--- Snacks ene l inventario ---");
        System.out.println(inventarioSnacks);
    }
    
    @Override
    public List<Snack> getSnacks(){
        return snacks;
    }
}
