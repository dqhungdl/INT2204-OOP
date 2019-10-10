package com.uet.int2204.Week6;

public class Circle extends Shape {

    private static final double ESP = 1e-3;

    protected Point center;

    protected double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2.0 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle circle = (Circle) obj;
            if (!center.equals(circle.center))
                return false;
            return Math.abs(radius - circle.radius) <= ESP;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Circle[center=" + center.toString() + ",radius=" + Math.round(radius * 10.0) / 10.0 + ",color=" + color + ",filled=" + filled + "]";
    }

//    public static void main(String[] args) {
//        Circle circle = new Circle(1, "RED", true);
//        System.out.println(circle.toString());
//        System.out.println(circle.getArea());
//        System.out.println(circle.getPerimeter());
//    }
}
