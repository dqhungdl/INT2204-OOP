package com.uet.int2204.Week6;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public Square(Point topLeft, double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.topLeft = topLeft;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        width = length = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square[topLeft=" + topLeft + ",side=" + Math.round(width * 10.0) / 10.0 + ",color=" + color + ",filled=" + filled + "]";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    //    public static void main(String[] args) {
//        Square square = new Square(5.1, "YELLOW", true);
//        System.out.println(square.toString());
//        System.out.println(square.getArea());
//        System.out.println(square.getPerimeter());
//    }
}
