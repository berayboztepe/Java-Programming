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
public class Circle extends Figure {
    protected double radius = 1;
    
    public Circle(){};
    
    public Circle(String n){
        super(n);
    }
    public Circle(String n, double radius){
        super(n);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double calculateArea(){
        return Math.PI*radius*radius;
 }

    /**
     *
     */
    @Override
    public void show(){
        super.show();
        System.out.println(", Radius: " + radius);
    }
}
