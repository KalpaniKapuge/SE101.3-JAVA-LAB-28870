package com.mycompany.containermain;
public class CylindricalContainer extends Container
{
  
    public CylindricalContainer(double height, double radius)
    {
        super(height, radius);
    }
    
    @Override
    public double volume() 
    {
        double pi = 3.14159;
        return pi * getRadius() * getRadius() * getHeight();
    }
}
