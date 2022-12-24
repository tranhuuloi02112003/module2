package bai7.interface_colorable;

public class Test {
    public static void main(String[] args) {
        Shape shape[] = new Shape[3];
        shape[0] = new Circle(5, "Red", true);
        shape[1] = new Rectangle(6, 4, "blu", false);
        shape[2] = new Square("Gray", true, 7);

        for (Shape item : shape) {
            if (item instanceof Square) {
                ((Square) item).howToColor();
            } else {
                System.out.println(item);
            }
        }

    }
}
