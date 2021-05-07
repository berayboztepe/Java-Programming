/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erasmus5;

import java.util.ArrayList;

/**
 *
 * @author beray
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Sphere> sphere = new ArrayList<>();
        ArrayList<Cylinder> cylinder = new ArrayList<>();
        ArrayList<Cone> cone = new ArrayList<>();
        
        Sphere s1 = new Sphere("Sphere 1", 2);
        Sphere s2 = new Sphere("Sphere 2", 4);
        Sphere s3 = new Sphere();
        sphere.add(s1);
        sphere.add(s2);
        sphere.add(s3);
        
        Cylinder c1 = new Cylinder("Cylinder 1", 3, 3);
        Cylinder c2 = new Cylinder("Cylinder 2", 5, 2);
        Cylinder c3 = new Cylinder();
        cylinder.add(c1);
        cylinder.add(c2);
        cylinder.add(c3);

        Cone con1 = new Cone("Cone 1", 2, 4);
        Cone con2 = new Cone("Cone 2", 3, 2);
        Cone con3 = new Cone();
        cone.add(con1);
        cone.add(con2);
        cone.add(con3);

        double max1 = 0, max2 = 0, max3 = 0;
        for(Sphere s:sphere){
            s.show();
            if(s.calculateVolume() > max1) {
                max1 = s.calculateVolume();
            }
        }
        for(Cylinder c:cylinder){
            c.show();
            if(c.calculateVolume() > max2) {
                max2 = c.calculateVolume();
            }
        }
        for(Cone con:cone){
            con.show();
            if(con.calculateVolume() > max3) {
                max3 = con.calculateVolume();
            }
        }
        double result = max1;
        String name = "Sphere";
        if(max2 > result) {
            result = max2;
            name = "Cylinder";
        }
        if(max3 > result){
            result = max3;
            name = "Cone";
        }
        
        System.out.println("\nSolid with maximum volume: " + name + "-Its Volume: "  + result);
        
    }
    
}
