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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Circle_Build();
        Fraction_Build();

    }
    public static void Circle_Build(){
        Circle circle1 = new Circle(10.5, 0.5, 1.5, "My first circle");
        System.out.println(circle1.getName() + " " + circle1.getRadius() + " " + circle1.getX() + " " + circle1.getY());
        circle1.setName("My first circle modified");
        circle1.setRadius(11);
        circle1.setX(1);
        circle1.setY(2);
        circle1.showCircleInfo();
        circle1.moveCenter(5, 6);
        circle1.setName("My first circle modified by centers");
        circle1.showCircleInfo();
    }
    
    public static void Fraction_Build(){
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(10, 11);
        f1.show();
        f2.show();
        Fraction f1_plus_f2 = f1.add(f2);
        f1_plus_f2.show();
        Fraction f2_sub_f1 = f2.subtract(f1);
        Fraction f2_mul_f1 = f2.multiply(f1);
        Fraction f2_div_f1 = f2.divide(f1);
        f2_sub_f1.show();
        f2_mul_f1.show();
        f2_div_f1.show();
    }
    
}
