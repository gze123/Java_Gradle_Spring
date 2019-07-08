package shape;

public class Square extends Shape {
    Shape shape;
    private double length;
    private double area;
    private String color ;

    public Square(Shape shape, double length) {
        this.shape = shape;
        this.length = length;
    }

    public Shape getShape() { return shape; }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        area = Math.pow(length,2);
        return area;
    }

}

