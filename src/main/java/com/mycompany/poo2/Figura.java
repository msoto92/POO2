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
public abstract class Figura 
{
    protected String color;
    
    public Figura()
    {
        
    }
    
    public Figura(String color)
    {
        this.color = color;
    }
    
    public abstract double perimetro();    
     
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
