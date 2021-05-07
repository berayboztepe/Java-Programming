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
public class Cone extends Circle{
    private double height = 1;
    
    public Cone(){};
    public Cone(String name, double height, double rad){
        super(name, rad);
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
        double s1 = Math.pow(radius, 2) + Math.pow(getHeight(), 2);
        double s = Math.sqrt(s1);
        return super.calculateArea() + (Math.PI * s * radius);
    }
    public double calculateVolume(){
        return (Math.PI * Math.pow(radius, 2) * getHeight()) / 3;
    }
    @Override
    public void show(){
        super.show();
        System.out.println(", Height: " + getHeight());
        System.out.println(", Area Cone: " + calculateArea());
        System.out.println(", Volume Cone: " + calculateVolume());
    }
}
