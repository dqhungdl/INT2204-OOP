package com.uet.int2204.Week8;

public class ExpressionTest {

    public static void main(String[] args) {
        Expression num1 = new Square(new Numeral(10));
        Expression num2 = new Numeral(-3);
        Expression num3 = new Addition(num1, num2);
        Expression num4 = new Multiplication(new Numeral(4), new Numeral(3));
        Expression num5 = new Square(new Addition(num3, num4));
        Expression num6 = new Division(new Numeral(), new Numeral());
        System.out.println(num5.toString());
        System.out.println(num5.evaluate());
        System.out.println(num6.evaluate());
    }
}
