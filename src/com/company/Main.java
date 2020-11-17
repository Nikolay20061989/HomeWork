package com.company;

public class Main {

    public static void main(String[] args) {
        Point a = new Point(2, 2);
        Point b = new Point(3, 4);
        Point c = new Point(1, 3);

        Triangle t = new Triangle(Point.sideLength(a, b), Point.sideLength(b, c), Point.sideLength(c, a));
        System.out.println(t.getArea());

        Square s = new Square(Point.sideLength(a, b));
        System.out.println(s.getArea());
        System.out.println(s.getPerimetr());

         Rectangle r  =new Rectangle(Point.sideLength(b, c), Point.sideLength(c, a));
         System.out.println(r.getArea());
         System.out.println(r.getPerimetr());
    }
}

