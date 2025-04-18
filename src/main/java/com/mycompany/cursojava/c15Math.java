/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursojava;

/**
 *
 * @author guill
 */
public class c15Math {
     public static void main(String[] args) {
        System.out.println("Clase Math");
        
        //################## RAIZ CUADRADA ################################
        
        // La raiz cuaadrada solo acepta datos tipo double
        
        double raiz = Math.sqrt(81);
        System.out.println("la raiz es " + raiz);
        
        //sacar raizes de tipo entero
        int raizEntero = (int)Math.sqrt(64);
        System.out.println("la raiz entera es " + raizEntero);
        
        //################## RAL CUADRADO ################################
        
        // los argumentos de pow funcion de Math deben ser double
        
        double base, exponente;
        base = 6;
        exponente = 3;
        
         double expo = Math.pow(base, exponente); // se debe aclarar el tipo de dato del expo
        System.out.println("El resultado de la exponenciacion es :" + expo);
        
        //################## ROUND ################################
        
        // si es double se debe gurdar en tipo long
        // si es un float se debe guardar en un int
        
        double number = 3.26;
        float number2 = 6.34f;
        
        // muestra los numeros sin redondear
        
        System.out.println(number);
        System.out.println(number2);
        
        long resultado = Math.round(number);// se guarda el resultado en un long
        int resultado2 = Math.round(number2);// se guarda el resultado en un int
        
        // Muestra los numeros redondeados
        
        System.out.println("El resultado del redondeo de tipo double es: "+ resultado);
        System.out.println("El resultado del redondeo de tipo float es: "+ resultado2);
        
        //################## RANDOM ################################
        
        double aleatorio;
        
        aleatorio = Math.random();
        
        System.out.println("El numero generado por random en este print es:" + aleatorio);
        
    }
}
