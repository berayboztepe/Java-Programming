/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erasmus2;

/**
 *
 * @author beray
 */
public class Rectangle {
    private int width;
    private int height;
    private String name;
    
    public Rectangle(int width, int height, String name){
        this.width = width;
        this.name = name;
        this.height = height;
    }
    public Rectangle(){
        this.width = 1;
        this.name = "Rectangle";
        this.height = 1;
    }
    public int getHeight(){
        return height;
    }
    
    public String getName(){
        return name;
    }
    public int getWidth(){
        return width;
    }
    public int CalculateArea(){
        return height * width;
    }
    public int CalculatePerimeter(){
        return 2*(height + width);
    }
    public String showInfo(){
        String result;
        result = "name: " + getName() + ", size (width, height): " + width + "," + height;
        result += " field (area, perimeter): " + CalculateArea() + ", " + CalculatePerimeter();
        return result;
    }
}
