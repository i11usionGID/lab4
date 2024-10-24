package ru.labs.figures;

public class Triangle extends Figure {
    private double heightSide;

    private double height;

    public Triangle() {

    }

    public Triangle(double heightSide, double height) {
        if (heightSide < 0 || height < 0) {
            System.out.println("данное значение не может быть меньше 0, данным присвоены значение 3 для стороны и 4 для высоты");
            this.heightSide = 3;
            this.height = 4;
        } else {
            this.heightSide = heightSide;
            this.height = height;
        }
    }

    public double getHeightSide() {
        return heightSide;
    }

    public double getHeight() {
        return height;
    }

    public void setHeightSide(double heightSide) {
        if (heightSide < 0) {
            System.out.println("данное значение не может быть меньше 0, данные не сохранены");
        } else {
            this.heightSide = heightSide;
        }
    }

    public void setHeight(double height) {
        if (height < 0) {
            System.out.println("данное значение не может быть меньше 0, данные не сохранены");
        } else {
            this.height = height;
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "heightSide=" + heightSide +
                ", height=" + height +
                '}';
    }

    @Override
    public double calculateSquare() {
        return heightSide * height / 2;
    }
}
