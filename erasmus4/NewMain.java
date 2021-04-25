/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erasmus4;

import java.util.Arrays;

/**
 *
 * @author beray
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Vector1[] = {1, 2, 3};
        double Vector2[] = {2, 4, 6};
        double Matrix1[][] = {{1, 2, 3}, {2, 4, 6}, {1, 2, 2}};
        double Matrix2[][] = {{2, 3, 4}, {6, 8, 10}, {7, 6, 7}};
        double Matrix3[][] = {{-2, 5, -4}, {1, -8, 0}, {2, 2, 2}};
        double Matrix4[][] = {{1, 5, 5}, {1, -8, -12}, {1, 3, 7}};
        
        Vector v1 = new Vector("v1", Vector1);
        Vector v2 = new Vector("v2", Vector2);
        Matrix m1 = new Matrix("m1", Matrix1);
        Matrix m2 = new Matrix("m2", Matrix2);
        Matrix m3 = new Matrix("m3", Matrix3);
        Matrix m4 = new Matrix("m4", Matrix4);
        
        
        System.out.println(v1.show());
        System.out.println(v2.show());
        System.out.println("Norm of v1 = " + v1.norm());
        System.out.println("Norm of v2 = " +v2.norm());
        System.out.println("v1 + v2 = " + Arrays.toString(v1.sum(Vector2)));
        System.out.println("v1 . v2 = " +v1.product(Vector2)); 
        System.out.println("*******************************************");
        System.out.println(m1.show());
        System.out.println(m2.show());
        System.out.println(m3.show());
        System.out.println(m4.show());
        System.out.println("Norm of m1 = " + m1.norm());
        System.out.println("Norm of m2 = " + m2.norm());
        System.out.println("Norm of m3 = " + m3.norm());
        System.out.println("Norm of m4 = " + m4.norm());
        m1.sum(m2);
        m3.product(m4);

    }
    
}
