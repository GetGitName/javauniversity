/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.operadores6;

import java.util.Scanner;

/**
 *
 * @author MB91491
 */
public class AreaPerimetroRectangulo {
    public static void main(String[] args) {        
        System.out.println("*** Calculo area y perimetro de un rectangulo ***");
        Scanner consola = new Scanner(System.in);
        
        System.out.print("Ingresa la base: ");
        double base = Double.parseDouble(consola.nextLine());
        
        System.out.print("Ingresa la altura: ");
        double altura = Double.parseDouble(consola.nextLine());
        
        double area = base * altura;
        double perimetro = 2 * (base + altura);
        
        System.out.printf("El area del rectangulo es: %.2f\n",area);
        System.out.printf("El perimetro del rectangulo es: %.2f\n",perimetro);
        
    }
}
