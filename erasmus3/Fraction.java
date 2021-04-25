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
public class Fraction {
    private int numerator=1;
    private int denumerator=1;
    
    public Fraction(){}
    public Fraction(int numerator, int denumerator) {
        this.numerator = numerator;
        this.denumerator = denumerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenumerator() {
        return denumerator;
    }

    public void setDenumerator(int denumerator) {
        if(denumerator == 0){
            System.out.println("Denumerator cannot be 0. I'm changing it to 1.");
            denumerator = 1;
        }
        this.denumerator = denumerator;
    }
    
    
    public void show(){
        System.out.println("Numerator: "+getNumerator()+" Denumerator: "+getDenumerator());
    }
    
    public Fraction add(Fraction f1){
        Fraction f=new Fraction();
        f.numerator=this.numerator*f1.denumerator +
        f1.numerator*this.denumerator;
        f.denumerator=f1.denumerator*this.denumerator;
        return f;
    }
 //add other methods: subtract, multiply and divide
 //add other methods
    public Fraction subtract(Fraction f1){
        Fraction f=new Fraction();
        f.numerator=this.numerator*f1.denumerator -
        f1.numerator*this.denumerator;
        f.denumerator=f1.denumerator*this.denumerator;
        return f;
    }
    public Fraction multiply(Fraction f1){
        Fraction f=new Fraction();
        f.numerator=this.numerator*f1.numerator; 
        f.denumerator=f1.denumerator*this.denumerator;
        return f;
    }
    public Fraction divide(Fraction f1){
        Fraction f=new Fraction();
        f.numerator=this.numerator/f1.numerator; 
        f.denumerator=this.denumerator/f1.denumerator;
        return f;
    }
}

