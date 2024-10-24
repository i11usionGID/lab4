package ru.labs.figures;

public class Circle extends Figure {
    private final double PI = 3.14;
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        if (radius < 0) {
            System.out.println("данное значение не может быть меньше 0, присвоено значение 3 для радиуса");
            this.radius = 3;
        } else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getPI() {
        return PI;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            System.out.println("данное значение не может быть меньше 0, данные не сохранены");
        } else {
            this.radius = radius;
        }
    }

    @Override
    public String toString() {
        return "Circle{" +
                "PI=" + PI +
                ", radius=" + radius +
                '}';
    }

    @Override
    public double calculateSquare() {
        return PI * radius * radius;
    }
}
