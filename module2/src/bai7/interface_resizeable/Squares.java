package bai7.interface_resizeable;

public class Squares extends Shape {
    private double edge = 1.0;



    public Squares() {
    }

    public Squares( double edge) {
        this.edge = edge;

    }

    public Squares(String color, boolean filled,  double edge) {
        super(color, filled);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }


    double getArea(){
        return this.edge*this.edge;
    }
    @Override
    public String toString() {
        return "Squares" +
                ", Edge=" + edge + super.toString()
                +" Area= "
                +this.getArea();
    }

    @Override
    public void resize(double percent) {
        this.edge+=this.edge*(float)percent/100;
    }
}
