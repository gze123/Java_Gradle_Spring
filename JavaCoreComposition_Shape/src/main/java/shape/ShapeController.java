package shape;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShapeController {
    private Shape shape = new Shape("Purple");

    @RequestMapping("/circle")
    public Circle getCircle(){
        Circle circle = new Circle(shape,7);
        return circle;
    }

    @RequestMapping("/rectangle")
    public Rectangle getRectangle(){
        Rectangle rectangle = new Rectangle(shape,7,7);
        return rectangle;
    }

    @RequestMapping("/square")
    public Square getSquare(){
        Square square = new Square(shape,7);
        return square;
    }

    @RequestMapping("/Triangle")
    public Triangle getTriangle(){
        Triangle triangle = new Triangle(shape,7,4);
        return triangle;
    }

}
