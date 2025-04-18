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
public class c12Operadores {
     public static void main(String[] args) {
        
        //Se debe importar la clase java util.scanner
        Scanner entrada =new Scanner(System.in);
        
        float n1, n2, sum, rest, mult ,div, mod; //Se pueden declarar 2 variables en una sola linea 
        
        System.out.println("Digita 2 numeros");// instruccion para el usuario
        
        n1 = entrada.nextFloat(); // se lee el dato ingresado por usuario con entrada.nextFloat()
        n2 = entrada.nextFloat(); // se lee el dato ingresado por usuario con entrada.nextFloat()
        
        
       // definicion de las operaciones
        
        sum = n1 + n2;
        rest = n1 - n2;
        mult = n1 * n2;
        div = n1 / n2;
        mod = n1 % n2;
        
        // mostrar al usuario las operaciones realizadas
        
        System.out.println("La suma es " + sum);
        System.out.println("La resta es " + rest);
        System.out.println("La multiplicacion es " + mult);
        System.out.println("La division es " + div);
        System.out.println("El modulo es " + mod);
    }
}
