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
public class Figure {
    protected String name = "Figure";
    public Figure(){};
    public Figure(String n){
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("Figure Entitled: " + name);
    }
}
