package ru.labs;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber() {
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void fromPolarToAlgebraic(double r, double theta) {
        this.real = r * Math.cos(theta);
        this.imaginary = r * Math.sin(theta);
    }

    @Override
    public String toString() {
        return String.format("%.10f + %.10fi", real, imaginary);
    }
}