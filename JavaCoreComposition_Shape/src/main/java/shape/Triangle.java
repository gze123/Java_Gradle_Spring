package shape;

public class Triangle extends Shape {
    Shape shape;
    private double base;
    private double height;
    private double area;
    private String color ;

    public Triangle(Shape shape, double base, double height) {
        this.shape = shape;
        this.base = base;
        this.height = height;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        area = base * height / 2;
        return area;
    }
}
