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
public class Sphere extends Circle{
    public Sphere(){};
    
    public Sphere(String n, double r){
        super(n, r);
    }
    @Override
    public double calculateArea(){
        return super.calculateArea() * 4;
    }
   
    public double calculateVolume(){
        double r_cube = Math.pow(radius, 3);
        return (Math.PI * r_cube * 4) / 3;
    }
    @Override
    public void show(){
        super.show();
        System.out.println(", Area Sphere: " + calculateArea());
        System.out.println(", Volume Sphere: " + calculateVolume());
    }
    
}
