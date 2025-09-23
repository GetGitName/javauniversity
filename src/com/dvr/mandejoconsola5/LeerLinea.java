/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.mandejoconsola5;

import java.util.Scanner;

/**
 *
 * @author MB91491
 */
public class LeerLinea {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una linea de texto: ");
        String linea = scanner.nextLine();
        System.out.println("La linea que introduciste es: ".concat(linea));
    }
    
}
