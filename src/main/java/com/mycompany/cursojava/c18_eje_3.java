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
public class c18_eje_3 {
     public static void main(String[] args) {
        
        //definir uso de scanner + import
        Scanner entrada = new Scanner(System.in);
        
        //Guillermo tiene N dolares. 
        //Luis tiene la mitad de lo que posee Guillermo
        //Juan tiene la mitad de lo que poseen Luis y Guillermo juntos
        //Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los 3
        
        float G, L, J, N;
        float dinero, total;
        
        System.out.println("Ingresa la cantidad de dinero de Guillermo");
        dinero = entrada.nextInt();
        N = dinero;
        
        
        G = N;
        L = G/2;
        J = (G+L)/2; 
        total = G + L + J;
        
        System.out.println("Guillermo tiene " + G + "dolares");
        System.out.println("Luis tiene " + L + "dolares");
        System.out.println("Juan tiene " + J + "dolares");
        System.out.println("La suma de lo que tiene  todos en total es: " + total + "dolares");
    }
}
