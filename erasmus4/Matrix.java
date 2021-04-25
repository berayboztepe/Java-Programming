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
public class Matrix implements IBase {
    private double[][] x = new double[N][N];
    private String name = "x";
    
    public Matrix(){
        
    }
    public Matrix(String name, double[][] x){
        this.x = x;
        this.name = name;
    }

    public void setX(double[][] x) {
        this.x = x;
    }

    public double[][] getX() {
        return x;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    
    @Override
    public double norm(){
        double max = -1;
        double[][] a = getX();

        for (int j = 0; j < a[0].length; j++){
            double sum = 0;
            for (double[] a1 : a) {
                sum += Math.abs(a1[j]);
            }
            if(max < sum){
                max = sum;
            }
        }
        return max;
    }
    @Override
    public String show(){
        String Mat;
        double[][] a = getX();
        Mat = "Name: " + getName() + ", Matrix: [";
        for (double[] a1 : a) {
            Mat += "[";
            for (int j = 0; j < a1.length; j++) {
                Mat += String.valueOf(a1[j]);
                if(j != a1.length - 1) Mat += ", ";
            }
            if(a1 == a[a.length - 1]) Mat += "]]";
            else Mat += "], ";
        }
        return Mat;
    }
    public void sum(Matrix b){
        double[][] new_matrix = new double[N][N];
        for (int j = 0; j < N; j++){
            for (int i = 0; i<N; i++) {
                new_matrix[j][i] = (this.x[j][i] + b.getX()[j][i]);
            }
    }
        Matrix m = new Matrix(this.getName() + "+" + b.getName(), new_matrix);
        System.out.println(m.show());
}
    public void product(Matrix b){
        double[][] new_matrix = new double[N][N];
        for (int j = 0; j < N; j++){
            for (int i = 0; i<N; i++) {
                new_matrix[j][i] = (this.x[j][i] * b.getX()[j][i]);
            }
    }
        Matrix m = new Matrix(this.getName() + "." + b.getName(), new_matrix);
        System.out.println(m.show());
    }
}
