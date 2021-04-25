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
public class Student {
    public String name;
    public int age;
    public String faculty;
    public double examGrades[];
    
    public Student(String name, int age, String faculty, double[] examGrades){
        this.name = name;
        this.age = age;
        this.faculty = faculty;
        this.examGrades = examGrades;
    }
    
    public Student(){
        this.name = "";
        this.age = 22;
        this.faculty = "";
        this.examGrades = new double[0];
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getFaculty(){
        return faculty;
    }
    public double[] getGrades(){
        return examGrades;
    }
    public double calculateAverage(){
        double avg = 0;
        double[] grade = getGrades();
        for(int i = 0; i < getGrades().length; i++){
            avg += grade[i];
        }
        return (avg/grade.length);
    }
    public String showStudentInfo(){
        String student;
        student = "Name: " + getName() + ", Age: " + getAge() + ", Faculty: " + getFaculty();
        student += ", Exam Grades: ";
        double[] grade = getGrades();
        for(int i = 0; i < getGrades().length; i++){
            student += String.valueOf(grade[i]);
            if(i != getGrades().length - 1) student += "-";
        }
        student += ", Average: " + calculateAverage();
        return student;
    }
}
