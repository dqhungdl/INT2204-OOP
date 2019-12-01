package com.uet.int2204.Week8;

public abstract class BinaryExpression extends Expression {

    protected Expression left;

    protected Expression right;

    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
