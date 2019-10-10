package com.uet.int2204.Week6;

import java.util.ArrayList;
import java.util.List;

public class Layer {

    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeCircles() {
        for (int i = 0; i < shapes.size(); i++)
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(i);
                i--;
            }
    }

    public String getInfo() {
        StringBuilder rs = new StringBuilder();
        rs.append("Layer of crazy shapes: ");
        if (shapes.size() > 0)
            rs.append("\n");
        for (int i = 0; i < shapes.size(); i++) {
            rs.append(shapes.get(i).toString());
            if (i < shapes.size() - 1)
                rs.append("\n");
        }
        return rs.toString();
    }

    public void removeDuplicates() {
        for (int i = 0; i < shapes.size(); i++)
            for (int j = 0; j < i; j++) {
                if (shapes.get(i).equals(shapes.get(j))) {
                    shapes.remove(i);
                    i--;
                }
            }
    }

//    public static void main(String[] args) {
//        Layer layer = new Layer();
//        Shape circle = new Circle(new Point(1, 1), 8.0, "RED", true);
//        Shape circle1 = new Circle(new Point(1, 1), 8.0, "BLUE", true);
//        Shape square = new Square(new Point(10, 11.5), 145, "BLUE", false);
//        Shape rectangle = new Rectangle(new Point(0.5, -1.5), 12.12, 13.13, "YELLOW", true);
//        layer.addShape(circle);
//        layer.addShape(circle1);
//        layer.addShape(rectangle);
//        layer.addShape(square);
//        layer.addShape(square);
//        layer.addShape(rectangle);
//        layer.addShape(rectangle);
//        layer.removeDuplicates();
//        layer.removeCircles();
//        System.out.println(layer.getInfo());
//    }
}
