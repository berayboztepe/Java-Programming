/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erasmus3;

/**
 *
 * @author beray
 */
public class Circle{
 //private fields (marked in blue):
    private double radius = 1;
    private double x = 0; //(x,y) coordinates of the circle center
    private double y = 0;
    private String name = "Circle";

    //public constructors:
    public Circle(){}
    public Circle(double radius, double x, double y, String name)
    { this.radius = radius;
    this.x = x;
    this.y = y;
    this.name = name; 
    }

    //public methods getXxxx/setXxx:
    public double getRadius() {
    return radius;
    }
    public void setRadius(double radius) {
    this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void showCircleInfo(){
        System.out.println("Name: " + getName() + " Radius: " + getRadius() + " X: " + getX() + " Y: " + getY());
    }
    public void moveCenter(double x, double y){
        setX(x);
        setY(y);
    }
 }
