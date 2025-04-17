/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursojava;

import javax.swing.JOptionPane;

/**
 *
 * @author guill
 */
public class c11JOptionPaneInOut {
     public static void main(String[] args) {
        System.out.println("JOptionPane");
        
        System.out.println("Permite una interaccion con el usuario con modales mejores definidos");
        System.out.println("Se debe importar la libreria ' import javax.swing.JOptionPane; ' antes de ");
        System.out.println(" la public class");
        
        String frase;
        int numero;
        char caracter;
        double decimal;
        
        //######################################## ENTRADAS ##################################################
        //###################################JOptionPane.showInputDialog######################################
        
        //JOptionPane en Strings (String)
        
        frase = JOptionPane.showInputDialog("Digita una frase: "); //aqui se usa JOptionPane para interactuar con el usuario
        System.out.println("Tu frase es: " + frase); // Uso de la frase guardada
        
         //JOptionPane en enteros(int)
        
        //NOTA JOptionPane Recibe datos de tipo String para recibir enteros debo convertir esos datos a tipo entero (casting)
        
        //numero = JOptionPane.showInputDialog("Ingresa un numero: "); mostraria error JOptionPane recibe solo string 
        // CASTING usar Integer.parseInt() para convertir en entero
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
        System.out.println("Tu numero es " + numero);
        
         //JOptionPane en cadenas (char)
         
         caracter = JOptionPane.showInputDialog("Ingresa un caracter: ").charAt(0);
         // Se hace casting usando el metodo charAt mediante chaining
         System.out.println("Tu caracter es: " + caracter);
         
         //JOptionPane en decimales (Double)
         
         //decimal = JOptionPane.showInputDialog("Ingresa un numero decimal con ',' como separador");
         //produce error por que se debe hacer casting a decimal double con Double.parseDouble()
         decimal = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un numero decimal:"));
         System.out.println("Tu numero decimal es: " + decimal);
         
         // NOTA = para float Float.parseFloat() y asi etc.
         
         //MOSTRAR DATOS CON JOptionPane
         System.out.println("Tambien existe un modal que muestra los datos su estructura se arma con ' JoptionPane.showMessageDialog");
         
         //######################################## SALIDAS ##################################################
         //###################################JOptionPane.showMessageDialog######################################
         
         JOptionPane.showMessageDialog(null,"Tu frase es :" + frase);
         JOptionPane.showMessageDialog(null,"Tu numero es :" + numero);
         JOptionPane.showMessageDialog(null,"Tu caracter es :" + caracter);
         JOptionPane.showMessageDialog(null,"Tu numero decimal es :" + decimal);
    }
}
