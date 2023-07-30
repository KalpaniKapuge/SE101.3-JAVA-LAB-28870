package com.mycompany.containermain;
import com.mycompany.containermain.CylindricalContainer;
public class ContainerMain
{

    public static void main(String[] args) 
    {
        CylindricalContainer sc = new CylindricalContainer(10, 5);
        System.out.println("Volume of the cylindrical container: " + sc.volume());
    }
}
