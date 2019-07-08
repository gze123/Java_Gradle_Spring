package shape;

public class Rectangle extends Shape {
    Shape shape;
    private double width;
    private double height;
    private double area;
    private String color ;

    public Rectangle(Shape shape, double width, double height) {
        this.shape = shape;
        this.width = width;
        this.height = height;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() { return height; }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        area =  width*height;
        return area;
    }

}
