package bai5;

public class Circle {
    private static final float PI = 3.14f;
    private double radius = 1;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return PI*radius*radius;
    }
}
class testCircle{
    public static void main(String[] args) {
        Circle circle= new Circle();
        System.out.println("Bán kinnh hình tròn:"+circle.getRadius());
        System.out.println("Diện tích hình tròn:"+circle.getArea());
    }
}


