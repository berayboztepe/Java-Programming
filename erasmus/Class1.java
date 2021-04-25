/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.erasmus;

/**
 *
 * @author beray
 */
public class Class1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // shift+alt+f will make code better
        System.out.println("Hello World! It's Java");
        for(int i = 1; i<=10; i++){
            for(int j = 1; j<i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i = 0; i<=4; i++){
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
