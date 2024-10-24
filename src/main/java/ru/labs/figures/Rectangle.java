package ru.labs.figures;

public class Rectangle extends Figure {

    private double length;

    private  double width;

    public Rectangle() {

    }

    public Rectangle(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("данное значение не может быть меньше 0, данным присвоены значение 3 для длины и 4 для ширины");
            this.length = 3;
            this.width = 4;
        } else {
            this.length = length;
            this.width = width;
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        if (length < 0) {
            System.out.println("данное значение не может быть меньше 0, данные не сохранены");
        } else {
            this.length = length;
        }
    }

    public void setWidth(double width) {
        if (length < 0) {
            System.out.println("данное значение не может быть меньше 0, данные не сохранены");
        } else {
            this.width = width;
        }
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public double calculateSquare() {
        return length * width;
    }
}
