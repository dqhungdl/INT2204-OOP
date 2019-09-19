package com.uet.int2204.Week3;

public class Fraction {

    private int numerator, denominator = 1;

    // constructor
    public Fraction(int numerator, int denominator) {
        if (denominator == 0)
            return;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0)
            return;
        this.denominator = denominator;
    }

    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public Fraction reduce() {
        int g = gcd(Math.abs(this.numerator), Math.abs(this.denominator));
        setNumerator(getNumerator() / g);
        setDenominator(getDenominator() / g);
        if (getDenominator() < 0) {
            setNumerator(-getNumerator());
            setDenominator(-getDenominator());
        }
        return this;
    }

    // add
    public Fraction add(Fraction other) {
        int newNumerator = getNumerator() * other.getDenominator() + getDenominator() * other.getNumerator();
        int newDenominator = getDenominator() * other.getDenominator();
        setNumerator(newNumerator);
        setDenominator(newDenominator);
        reduce();
        return this;
    }

    // subtract
    public Fraction subtract(Fraction other) {
        int newNumerator = getNumerator() * other.getDenominator() - getDenominator() * other.getNumerator();
        int newDenominator = getDenominator() * other.getDenominator();
        setNumerator(newNumerator);
        setDenominator(newDenominator);
        reduce();
        return this;
    }

    // multiple
    public Fraction multiply(Fraction other) {
        int newNumerator = getNumerator() * other.getNumerator();
        int newDenominator = getDenominator() * other.getDenominator();
        setNumerator(newNumerator);
        setDenominator(newDenominator);
        reduce();
        return this;
    }

    // divide
    public Fraction divide(Fraction other) {
        if (other.getNumerator() == 0)
            return this;
        int newNumerator = getNumerator() * other.getDenominator();
        int newDenominator = getDenominator() * other.getNumerator();
        setNumerator(newNumerator);
        setDenominator(newDenominator);
        reduce();
        return this;
    }

    // equals
    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {
            Fraction f = (Fraction) obj;
            reduce();
            f.reduce();
            return getNumerator() == f.getNumerator() && getDenominator() == f.getDenominator();
        }
        return false;
    }

//    public static void main(String[] args) {
//        Fraction f1 = new Fraction(2, 10);
//        Fraction f2 = new Fraction(-1, -5);
//        System.out.println(f1.equals(f2));
//    }
}
