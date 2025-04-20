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
public class c17_eje_2 {
        public static void main(String[] args) {
        //Hacer un programa que calcule e imprima el salario semanal de un empleado a partir de sus horas semanales
        //trabajadas y de su salario por hora

        
        float salarioSemana, salarioDia, salarioHora, diasSemana, horasTrabajadasxDia, horasTrabajadasxSemana, salarioTotal, horasExtrasTrabajadas;
        
        salarioSemana = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor del salario Semanal del trabajador: \n "));
        diasSemana = Float.parseFloat(JOptionPane.showInputDialog("ingrese los dias de la semana a trabajar entre 1 y 7 dias: \n "));
        horasTrabajadasxDia = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas al dia: \n "));
        horasExtrasTrabajadas = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de horas extras trabajadas en la semana: \n"));
         
        
        salarioDia = salarioSemana / diasSemana;
        JOptionPane.showMessageDialog(null, "El salario por dia equivale a: " + salarioDia );
        salarioHora = salarioDia / horasTrabajadasxDia;
        JOptionPane.showMessageDialog(null, "El salario por hora equivale a: " + salarioHora );
        
        horasTrabajadasxSemana = (diasSemana * horasTrabajadasxDia);
        
        salarioTotal = (horasTrabajadasxSemana + horasExtrasTrabajadas ) * salarioHora;
        JOptionPane.showMessageDialog(null, "El salario Totalequivale a: " + salarioTotal );
        
        //Retroalimentacion eliminar variables no usadas en declaracion de variables
        //asegurar que no se introduzcan numeros negativos 
    }
}
