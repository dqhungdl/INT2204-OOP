package com.uet.int2204.Week6;

public class Rectangle extends Shape {

    private static final double ESP = 1e-3;

    protected Point topLeft;

    protected double width;

    protected double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2.0 * (width + length);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) obj;
            if (!topLeft.equals(rectangle.topLeft))
                return false;
            return Math.abs(width - rectangle.width) <= ESP && Math.abs(length - rectangle.length) <= ESP;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Rectangle[topLeft=" + topLeft.toString() + ",width=" + Math.round(width * 10.0) / 10.0 + ",length=" + Math.round(length * 10.0) / 10.0 + ",color=" + color + ",filled=" + filled + "]";
    }

//    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle(4.25, 6, "BLUE", true);
//        System.out.println(rectangle.toString());
//        System.out.println(rectangle.getArea());
//        System.out.println(rectangle.getPerimeter());
//    }
}
