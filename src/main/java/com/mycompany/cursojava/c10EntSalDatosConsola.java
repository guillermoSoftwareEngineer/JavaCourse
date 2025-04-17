/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursojava;

import java.util.Scanner;

/**
 *
 * @author guill
 */
public class c10EntSalDatosConsola {
    public static void main(String[] args) {
        //NUMEROS
        
        System.out.println("Para usar librerias de entrada y salida de datos se usa la libreria scanner");
        System.out.println("La libreria se importa al inicio antes  de public class");
        System.out.println("Se agrega el comando ' import java.util.Scanner; '");
        
        Scanner entrada = new Scanner(System.in); //SIEMPRE DEFINIR ESTA LINEA PARA ENTRADA SCANNER
        // En este caso se usa la palabra "entrada" pero esta puede cambiar funciona como un alias
        
        int edad;
        
        System.out.println("Ingresa tu edad: ");
        edad = entrada.nextInt();//Aqui  se define  la variable que va recibir el dato del usurio
        System.out.println("Tu edad es " + edad + " years");
        
        //Para tipos de dato entero usamos nextInt()
        //Para datos de tipo flotante usamos nextFloat()
        //Para datos de tipo double usamos nextDouble()
        
        // NOTA === los numeros flotantes se declaran con coma ","
        //Si se declaran con punto "." da error
        
        //CADENAS
        
        Scanner cadena = new Scanner(System.in); //SIEMPRE DEFINIR ESTA LINEA PARA ENTRADA SCANNER
        // En este caso se usa la palabra "cadena" pero esta puede cambiar funciona como un alias
        
        String nombre;
        System.out.println("Digita tu nombre: ");
        nombre = cadena.next();//Usar nextLine() para guardar mas alla de los espacios
        System.out.println("Tu nombre es: " + nombre);
        
        //next() solo guarda el nombre hasta encontrar un espacio si escribo "Jose Guillermo" solo guarda "Jose"
        //nextLine() guarda todo incluso despues de los espacios
        //next().charAt(0) necesita el otro metodo (chaining) para indicar que es un caracter
        //ademas el uso de 0 como argumento indica que se guarde el primer caracter del string
    }
}
