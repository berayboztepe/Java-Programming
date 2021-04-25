/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erasmus4;

/**
 *
 * @author beray
 */
public class Vector implements IBase {
    private String name = "v";
    private double[] x = new double[N];
    
    public Vector(){
        
    }
    
    public Vector(String name, double[] x){
        this.name = name;
        this.x = x;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }

    public void setX(double[] x) {
        this.x = x;
    }

    public double[] getX() {
        return x;
    }
    
    
    @Override
    public String show(){
        String Vec;
        double[] X = getX();
        Vec = "Name: " + getName() + ", Vector: " + "[";
        
        for(int i = 0; i<X.length;i++){
            Vec += String.valueOf(X[i]);
            if(i != X.length - 1) Vec += ", ";
        }
        Vec += "]";
        return Vec;
        
    }
    @Override
    public double norm(){
        double[] X = getX();
        double sum = 0;
        for(int i = 0; i<X.length;i++){
            sum += Math.pow(X[i], 2);
        }
        
        return Math.sqrt(sum);
    }
    
    public double[] sum(double[] b){
        double new_vector[] = new double[N];
        for(int i = 0; i<N;i++){
            new_vector[i] = this.x[i] + b[i];
        }
        return new_vector;
    }
    public double product(double[] b){
        double sum = 0;
        for(int i = 0; i<N; i++){
            sum += (this.x[i] * b[i]);
        }
        return sum;
    }
}
