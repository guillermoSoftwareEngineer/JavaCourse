/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursojava;

/**
 *
 * @author guill
 */
public class c14OperadorIncremDecrem {
    public static void main(String[] args) {
        
        System.out.println("Se puede incrementar con ++");
        System.out.println("Se puede decrementar con --");
        
        //#####################INCREMENTO#####################
        
        int x = 2;
        
        System.out.println("El valor de x es: " + x);
        
         x++ ;//Se incrementa
        System.out.println("El nuevo valor  de x es " + x);
        
         //#####################DECREMENTO#####################
        
        int Y = 5;
        
        System.out.println("El valor de Y es: " + Y);
        
        Y-- ;//Se decrementa
        System.out.println("El nuevo valor  de Y es " + Y);
        
         //##################### PROBLEMA DE ASIGNACION#####################
         
         // como sufijo = a ++ primero asignacion no funciona incremento
         //como sufijo = ++ primero iincremento y luego asignacion (precedencia de operadores)
        
         int a,b;
         a = 5;
         
         // b = a++;  tiene precedencia la asignacion con = por eso no funciona
         b = ++a;
         
         System.out.println("El valor de a es: " + a);
         System.out.println("El valor de b es: " + b);
         
    } 
}
