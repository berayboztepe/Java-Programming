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
public class Fruit {
    private String name;
    private double weight;
    private String country;
    private int seeds;
    
    public Fruit(){};
    public Fruit(String name, String country){
        this.name = name;
        this.country = country;
    }
    public Fruit(String name, double weight, String country, int seeds){
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.seeds=seeds;
    }
    public void eatFruit(){
        if(weight > 0) weight -= 0.5;  
    }
    public void removeSeeds(){
        if(seeds > 0) seeds -= 0.5;
    }
    public void showInfo(){
        String result;
        result = "name: " + name + ", weight: " + weight;
        result += ", country: " + country + ", seeds: " + seeds;
        System.out.println(result);
    }
}
