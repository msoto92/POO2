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
public class Triangulo extends Figura
{
    private double altura;
    private double base;
    
    public Triangulo()
    {
        
    }
    
    public Triangulo(String color, double altura, double base)
    {
        super(color);
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    @Override
    public double perimetro()
    {        
        double perimetro = (2 * altura) + base;
        return perimetro;
    }
    
    @Override
    public String toString()
    {
        return "El Triangulo de color " + getColor() + " tiene un perimetro: " + perimetro();
    }
}
