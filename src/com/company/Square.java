package com.company;

public class Square extends Shape {
    public double a;

    public Square(double a) {
        this.a = a;
    }

    public Square() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getPerimetr() {
        return a * 4;
    }

    public double getArea() {
        return a * a;
    }
}
