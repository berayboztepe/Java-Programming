/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erasmus2_homework;

/**
 *
 * @author beray
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double grades1[] = {90, 90, 100}; 
        double grades2[] = {40, 20, 30}; 
        double grades3[] = {100, 70, 80}; 

        Student s1 = new Student("Beray", 20, "Computer Science", grades1);
        Student s2 = new Student("Jonas", 19, "Electrical Engineering", grades2);
        Student s3 = new Student("Eve", 20, "Mechanical Engineering", grades3);
        Student s4 = new Student();
        
        System.out.println(s1.showStudentInfo());
        System.out.println(s2.showStudentInfo());
        System.out.println(s3.showStudentInfo());
        System.out.println(s4.showStudentInfo());
    }
    
}
