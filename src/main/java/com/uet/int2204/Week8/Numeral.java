package com.uet.int2204.Week8;

public class Numeral extends Expression {

    private double value;

    public Numeral() {
        this.value = 0;
    }

    public Numeral(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Long.toString(Math.round(value));
    }

    @Override
    public double evaluate() {
        return value;
    }
}
