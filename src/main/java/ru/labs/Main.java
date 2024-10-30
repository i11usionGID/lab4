package ru.labs;

import ru.labs.figures.*;

public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle(5.5);
        circle.calculateSquare();
        Figure rectangle = new Rectangle(12.6, 10.11);
        rectangle.calculateSquare();
        Figure triangle = new Triangle(12.1, 7.5, 6.6);
        triangle.calculateSquare();
        Geometry geometry = new Geometry();
        geometry.addElement(circle);
        geometry.addElement(rectangle);
        geometry.addElement(triangle);
        geometry.calculateAllSquares();
        geometry.popElement(rectangle);
        geometry.calculateAllSquares();
        double r = 5.0;
        double theta = Math.PI / 4;
        ComplexNumber complex = new ComplexNumber();
        complex.fromPolarToAlgebraic(r, theta);
        System.out.println("Комплексное число в алгебраической форме: " + complex);
        Point p1 = new Point(3, 4);
        Point topLeft = new Point(1, 5);
        Point bottomRight = new Point(6, 1);
        Point center = new Point(0, 0);
        System.out.println("p1: " + p1);
        System.out.println("Расстояние от начала координат до p1: " + p1.distanceFromOrigin());
        System.out.println("p1 находится в прямоугольнике: " + p1.isInRectangle(topLeft, bottomRight));
        System.out.println("p1 находится в окружности радиусом 5: " + p1.isInCircle(center, 5));

        Point3D p2 = new Point3D(4, 4, 2);
        Point3D corner1 = new Point3D(1, 1, 1);
        Point3D corner2 = new Point3D(6, 6, 6);
        Point3D center1 = new Point3D(0, 0, 0);

        System.out.println("p2: " + p2);
        System.out.println("Расстояние от начала координат до p2: " + p2.distanceFromOrigin());
        System.out.println("p2 находится в параллелепипеде: " + p2.isInBox(corner1, corner2));
        System.out.println("p2 находится в сфере радиусом 5: " + p2.isInSphere(center1, 5));

        Point3D p3d = new Point3D(2, 3, 4);
        System.out.println("До масштабирования: " + p3d);
        p3d.scale(2);
        System.out.println("После масштабирования: " + p3d);
    }
}