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
public class c16_eje_1 {
        public static void main(String[] args) {
        //calcule e imprima la suma de tres calificaciones
        
        //declaracion de la tres variables para notas
        int nota1, nota2, nota3;
        
        // Consulta al usuario las tres notas
        nota1= Integer.parseInt(JOptionPane.showInputDialog("Ingresa la primera nota"));
        nota2= Integer.parseInt(JOptionPane.showInputDialog("Ingresa la Segunda nota"));
        nota3= Integer.parseInt(JOptionPane.showInputDialog("Ingresa la tercera nota"));
        
        //imprimir la nota
        
        int resultado = nota1+ nota2 + nota3;
        JOptionPane.showMessageDialog(null, "La suma de las notas es" + resultado );
        
    }
}
