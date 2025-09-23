package com.dvr.mod1;

/**
 *
 * @author MB91491
 */
public class TiposDatos {
    
    public static void main(String[] args) {
        //Tipos de Datos en Java
        //Enteros (valor default 0)
        byte tipoByte = 127;
        System.out.println("tipoByte: "+tipoByte);
        short tipoShort = 32000;
        System.out.println("tipoShort: " +tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt: "+tipoInt);
        long tipoLong = 987654321098765432L;
        System.out.println("tipoLong: "+tipoLong);
        
        // Punto flotante 0.0
        float tipoFloat = 3.14F;
        System.out.println("tipoFloat: "+tipoFloat);
        double tipoDouble = 3.1315D;
        System.out.println("tipoDouble: "+tipoDouble);
        
        // char \u0000
        char tipoChar = 'A'; // Caracteres unicode
        System.out.println("tipoChar: "+tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar: "+tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar: "+tipoChar);        
        
        // Boolean false
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean: "+tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean: "+tipoBoolean);
        
        String nombre = null;
        System.out.println("nombre= "+nombre);
        nombre = "daniel";
        System.out.println("nombre= "+nombre);
    }
    
}
