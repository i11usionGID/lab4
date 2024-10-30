package ru.labs.figures;

public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
    }

    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0 || !isValidTriangle(sideA, sideB, sideC)) {
            System.out.println("Заданы некорректные значения сторон. Всем сторонам присвоено значение 1.");
            this.sideA = 1;
            this.sideB = 1;
            this.sideC = 1;
        } else {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideA(double sideA) {
        if (sideA <= 0) {
            System.out.println("Значение стороны не может быть меньше или равно 0. Данные не сохранены.");
        } else if (!isValidTriangle(sideA, this.sideB, this.sideC)) {
            System.out.println("С такими сторонами треугольник не может существовать. Данные не сохранены.");
        } else {
            this.sideA = sideA;
        }
    }

    public void setSideB(double sideB) {
        if (sideB <= 0) {
            System.out.println("Значение стороны не может быть меньше или равно 0. Данные не сохранены.");
        } else if (!isValidTriangle(this.sideA, sideB, this.sideC)) {
            System.out.println("С такими сторонами треугольник не может существовать. Данные не сохранены.");
        } else {
            this.sideB = sideB;
        }
    }

    public void setSideC(double sideC) {
        if (sideC <= 0) {
            System.out.println("Значение стороны не может быть меньше или равно 0. Данные не сохранены.");
        } else if (!isValidTriangle(this.sideA, this.sideB, sideC)) {
            System.out.println("С такими сторонами треугольник не может существовать. Данные не сохранены.");
        } else {
            this.sideC = sideC;
        }
    }

    private boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }

    @Override
    public double calculateSquare() {
        double semiPerimeter = (sideA + sideB + sideC) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
    }
}
