/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erasmus5;

/**
 *
 * @author beray
 */
public class Cylinder extends Circle {
    private double height = 1;
    
    public Cylinder(){};
    public Cylinder(String n, double height, double radius){
        super(n, radius);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    
    @Override
    public double calculateArea()
    {
        return (2*super.calculateArea() + (2 * Math.PI * getHeight() * radius));
    }
    public double calculateVolume(){
        return Math.PI * Math.pow(radius, 2) * getHeight();
    }
    @Override
    public void show(){
        super.show();
        System.out.println(", Height: " + getHeight());
        System.out.println(", Area Cylinder: " + calculateArea());
        System.out.println(", Volume Cylinder: " + calculateVolume());
    }
    
    
}
