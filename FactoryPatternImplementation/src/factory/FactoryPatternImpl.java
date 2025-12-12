package factory;


import shape.Shape;

public class FactoryPatternImpl {
    public static void main(String args[]){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        Shape square = shapeFactory.getShape("SQUARE");
        Shape circle = shapeFactory.getShape("CIRCLE");

        System.out.println(rectangle.getShape());
        System.out.println(square.getShape());
        System.out.println(circle.getShape());
    }
}
