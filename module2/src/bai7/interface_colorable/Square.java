package bai7.interface_colorable;

public class Square extends Shape implements Colorable {
    private double edge;

    public Square() {
    }

    public Square(String color, boolean filled, double edge) {
        super(color, filled);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getArea() {
        return edge * edge;
    }

    public double getPerimeter() {
        return edge * 4;
    }

    @Override
    public String toString() {
        return " Rectangle edge=" + getEdge()
                + "Area=" + getArea()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
