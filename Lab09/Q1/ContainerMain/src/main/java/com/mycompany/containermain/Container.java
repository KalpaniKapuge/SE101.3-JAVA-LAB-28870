package com.mycompany.containermain;
abstract class Container
{
    private double height;
    private double radius;

    public Container(double height, double radius) 
    {
        this.height = height;
        this.radius = radius;
    }

    
    public abstract double volume();
    
     public double getHeight() 
    {
        return height;
    }

    public double getRadius() {
        return radius;
    }
    

}
