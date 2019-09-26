package com.uet.int2204.Week5;

public class Cylinder extends Circle {

    private double height = 1.0;

    public Cylinder() {

    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return Math.round((2.0 * PI * getRadius() * getRadius() + 2.0 * PI * getRadius() * height) * 100.0) / 100.0;
    }

    public double getVolume() {
        return Math.round((PI * getRadius() * getRadius() * height) * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + height + "]";
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2, 3, "red");
        System.out.println(cylinder.toString());
        System.out.println(cylinder.getArea() + " " + cylinder.getVolume());
    }
}
