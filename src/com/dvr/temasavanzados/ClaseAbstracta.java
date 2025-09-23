/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.temasavanzados;

/**
 *
 * @author MB91491
 */
public class ClaseAbstracta {
    public static void main(String[] args) {        
        System.out.println("*** Figura geometrica ***");
        FiguraGeometrica figura = new Rectangulo();
        figura.dobujar();
        figura = new Circulo();
        figura.dobujar();
    }
}

abstract class FiguraGeometrica {
    public abstract void dobujar();
}


class Rectangulo extends FiguraGeometrica{

    @Override
    public void dobujar() {
        System.out.println("Se dibuja rectangulo");
    }
    
}

class Circulo extends FiguraGeometrica {

    @Override
    public void dobujar() {
        System.out.println("Se dibuja Circulo;");
    }
    
}