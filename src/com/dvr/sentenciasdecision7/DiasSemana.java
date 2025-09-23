/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvr.sentenciasdecision7;

/**
 *
 * @author MB91491
 */
public class DiasSemana {
    public static void main(String[] args) {        
        System.out.println("*** Dia de la semana con Switch ***");
        int dia = 2; //suponiendo que 1 -lunes, 2 - martes etc
        
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("MArtes");
                //break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:                
                System.out.println("Dia invalido");
        }
    }
}
