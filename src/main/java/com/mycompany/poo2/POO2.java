/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo2;

/**
 *
 * @author Miguel
 * Celular: 300 6681894
 * Correo: msoto1992@outlook.com
 * Correo universidad: mticpro39fi_bog@unal.edu.co  
 */
public class POO2 {

    public static void main(String[] args) {

        Circulo circulo1 = new Circulo("rojo", 5);
        Cuadrado cuadrado1 = new Cuadrado("verde", 2);
        Triangulo triangulo1 = new Triangulo("morado",5,2);
        
        System.out.println(circulo1.toString());
        System.out.println(cuadrado1.toString());
        System.out.println(triangulo1.toString());
        
    }
}
