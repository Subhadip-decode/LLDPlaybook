package factory;

import shape.CircleShape;
import shape.RectangleShape;
import shape.Shape;
import shape.SquareShape;

public class ShapeFactory {
    public Shape getShape(String shape){
        switch(shape){
            case "RECTANGLE":
                return new RectangleShape();
            case "SQUARE":
                return new SquareShape();
            default:
                return new CircleShape();
        }
    }
}
