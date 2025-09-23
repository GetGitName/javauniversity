/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.operadores6;

/**
 *
 * @author MB91491
 */
public class PresedenciaOperadores {
    public static void main(String[] args) {        
        System.out.println("*** Precedencia de Operadores ***");
        // Precedencia de Operadores en Java:
        // 1. Parentesis y Corchetes
        // 2. Operadores unarios -, ++, --
        // 3. Operadores aritmeticos *, / y %
        // 4. Operadores aritmeticos + y -
        // 5. Relacionales <, <=, >, >=
        // 6. Equivalencia == y !=
        // 7. Logicos && y ||
        // 8. Asignacion =, +=, -=, *=, etc

        // Expresion
        // Paso 1. Division 12 / 3 = 4
        // Paso 2. Multiplicacion 2 * 3 = 6
        // Paso 3. Suma 4 + 6 = 10
        // Paso 4. Resta 10 - 1 = 9
        int a = 12 / 3 + 2 * 3 - 1;
        System.out.println("a = " + a);
    }
}
