/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursojava;

/**
 *
 * @author guill
 */
public class c9NullNoPrimitivo {
    public static void main(String[] args) {
        Integer numero = null; // los datos no primitivos si pueden almacenar null
        //Int numero = null; // los datos primitivos NO pueden almacenar null, producen error
        System.out.println("No almacena nada es "+ numero);
        
        //los datos no primitivos tienen metodos
        //numero.shortValue()
    }
}
