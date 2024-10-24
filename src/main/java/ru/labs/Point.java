package ru.labs;

public class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public boolean isInRectangle(Point top_left, Point bottom_right) {
        return (x >= top_left.getX() && x <= bottom_right.getX()) &&
                (y >= bottom_right.getY() && y <= top_left.getY());
    }

    public boolean isInCircle(Point center, double radius) {
        double distance = Math.sqrt(Math.pow(x - center.getX(), 2) + Math.pow(y - center.getY(), 2));
        return distance <= radius;
    }

    public void scale(double scaleFactor) {
        this.x = (int)(x * scaleFactor);
        this.y = (int)(y * scaleFactor);
    }
}

