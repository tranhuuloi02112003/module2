package bai7.interface_resizeable;

public class Test {
    public static void main(String[] args) {
        Shape shapes[] = new Shape[3];
        shapes[0] = new Circle(5, "Red", true);
        shapes[1] = new Rectangle(6, 4, "Blu", false);
        shapes[2] = new Squares("Red", true, 4);

        System.out.println("Trước khi thay đổi");
        for (Shape s : shapes) {
            System.out.println(s.toString());
        }
        System.out.println("Sau khi thay đổi");
        for (Shape s : shapes) {
            s.resize(Math.random() * 100);
            System.out.println(s.toString());
        }

    }
}
