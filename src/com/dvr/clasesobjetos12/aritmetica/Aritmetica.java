/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.clasesobjetos12.aritmetica;

/**
 *
 * @author MB91491
 */
public class Aritmetica {
    
    private int operando1;
    private int operando2;
    
    public Aritmetica(){System.out.println("Ejecutando constructor");}
    
    public Aritmetica(int operando1, int operando2){
        System.out.println("Recibiendo datos");
        this.operando1 = operando1;        
        this.operando2 = operando2;
        System.out.println("Operador this: "+this);
    }
    
    public void sumar() {
        int resultado = operando1 + operando2;
        System.out.println("La suma es: "+resultado);
    }
    
    public void restar() {
        int resultado = operando1 - operando2;
        System.out.println("La resta es: "+resultado);
    }
    
    public static void main2(String[] args) {        
        System.out.println("*** Ejemplo aritmetica ***");
        
        Aritmetica aritmetica1 = new Aritmetica(5,7);
        //aritmetica1.operando1 = 5;
        //aritmetica1.operando2 = 7;
        aritmetica1.sumar();
        aritmetica1.restar();
        
        
        System.out.println();
        System.out.println("Aritmetica 2");
        System.out.println();
        
        Aritmetica aritmetica2 = new Aritmetica(12,16);
        //aritmetica2.operando1 = 12;
        //aritmetica2.operando2 = 16;
        aritmetica2.sumar();
        aritmetica2.restar();
    }
    
    public int getOperador1(){
        return this.operando1;
    }
    
    public int getOperador2(){
        return this.operando2;
    }
    
    public void setOperando1(int operando1){
        this.operando1 = operando1;
    }
    
    public void setOperando2(int operando2){
        this.operando1 = operando2;
    }
}
