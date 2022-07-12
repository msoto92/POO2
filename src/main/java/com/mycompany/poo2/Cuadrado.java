/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo2;


/**
 *
 * @author Miguel
 * Celular: 300 6681894
 * Correo: msoto1992@outlook.com
 * Correo universidad: mticpro39fi_bog@unal.edu.co  
 */
public class Cuadrado extends Figura
{
    private double lado;
    
    public Cuadrado()
    {
        
    }
    
    public Cuadrado(String color, double lado)
    {
        super(color);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double perimetro()
    {
        double perimetro = 4 * lado;
        return perimetro;
    }
    
    @Override
    public String toString()
    {
        String obj = "El cuadrado de color: " + color + " tiene un perimetro de " + perimetro();
        return obj;
    }
    
}
