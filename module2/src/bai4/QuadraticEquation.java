package bai4;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    double getRoot1(){
        return (-b+Math.sqrt(getDiscriminant()) )/2*a;
    }
    double getRoot2(){
        return (-b-Math.sqrt(getDiscriminant()) )/2*a;
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    double getDiscriminant() {
        return getB() * getB() - 4 * getA() * getC();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a,b,c:");
        QuadraticEquation quadraticEquation = new QuadraticEquation(scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat());
        System.out.println("Denta:" + quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant()>=0){
            System.out.println("Nghiệm thứ nhất:"+quadraticEquation.getRoot1());
            System.out.println("Nghiệm thứ hai:"+quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant()==0) {
            System.out.println("PT có 1 nghiệm duy nhất:"+quadraticEquation.getRoot1());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
