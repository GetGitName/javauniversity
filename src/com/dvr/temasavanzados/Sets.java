/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.temasavanzados;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author MB91491
 */
public class Sets {
    public static void main(String[] args) {        
        System.out.println("*** Sets ***");
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Daniel");
        conjunto.add("Daniel");
        conjunto.add("elemento");
        conjunto.add("Add");
        
        System.out.println("Elementosforech");
        conjunto.forEach(System.out::println);
        
        System.out.println("Nueva lista");
        conjunto.remove("Add");
        conjunto.forEach(System.out::println);
    }
}
