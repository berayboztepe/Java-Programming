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
public class Class2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle r = new Rectangle(7, 12, "Rectangle 1");
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(100, 100, "Rectangle 3");
        Rectangle r3 = new Rectangle(200, 50, "Rectangle 4");
        System.out.println(r.showInfo());
        System.out.println(r1.showInfo());
        System.out.println("name: " + r2.getName() + ", size (width, height): " + r2.getWidth() + ", " + r2.getHeight()
        + " field (area, perimeter): " + r2.CalculateArea() + ", " + r2.CalculatePerimeter());
        System.out.println("name: " + r3.getName() + " size (width, height): " + r3.getWidth() + ", " + r3.getHeight()
        + " field (area, perimeter): " + r3.CalculateArea() + ", " + r3.CalculatePerimeter());
    }
    
}
