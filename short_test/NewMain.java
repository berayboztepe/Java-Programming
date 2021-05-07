/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short_test;

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
        Fruit f1 = new Fruit("banana", 5, "panama", 4);
        Fruit f2 = new Fruit("apple", 7, "germany", 2);
        Fruit f3 = new Fruit("grape", 3, "turkey", 7);
        
        f1.showInfo();
        f2.showInfo();
        f3.showInfo();
        f1.eatFruit();
        f1.showInfo();
        f2.removeSeeds();
        f2.showInfo();
        f3.eatFruit();
        f3.showInfo();
    }
    
}
