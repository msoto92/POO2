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
public class Circulo extends Figura
{
    private double radio;

    public Circulo()
    {
        
    }
    
    public Circulo(String color,double radio)
    {
        super(color);
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double perimetro()
    {
        return 2 * radio * Math.PI;
    }
    
    @Override
    public String toString()
    {
        String obj = "El circulo de color: " + color + " tiene perimetro" +perimetro(); 
        return obj;
    }
}
