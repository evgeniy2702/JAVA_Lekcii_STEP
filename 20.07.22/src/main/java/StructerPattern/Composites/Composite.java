package StructerPattern.Composites;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Shape {

    static List<Shape> shapes;

    public Composite() {
    }

    public static void main(String[] args) {
        GreenTriangle greenTriangle = new GreenTriangle();
        System.out.println(greenTriangle.name);
        Rectangle rectangle = new Rectangle();
        RadRectangle radRectangle = new RadRectangle();
        shapes = new ArrayList();
        shapes.add(greenTriangle);
        shapes.add(rectangle);
        shapes.add(radRectangle);
    }
}
