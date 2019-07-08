package shape;

public class Circle extends Shape {
    Shape shape;
    private double radius,area;
    private String color;


    public Circle(Shape shape, double radius) {
        this.shape = shape;
        this.radius = radius;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        area = Math.PI * radius *radius;
        return area;
    }

}
