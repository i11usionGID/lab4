package ru.labs;

public class Point3D extends Point {
    private int z;

    public Point3D() {
        super();
        this.z = 0;
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void setLocation(int x, int y, int z) {
        super.setLocation(x, y);
        this.z = z;
    }

    @Override
    public void setLocation(int x, int y) {
        super.setLocation(x, y);
        this.z = 0;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }

    @Override
    public double distanceFromOrigin() {
        return Math.sqrt(getX() * getX() + getY() * getY() + z * z);
    }

    public boolean isInBox(Point3D corner1, Point3D corner2) {
        return (getX() >= Math.min(corner1.getX(), corner2.getX()) && getX() <= Math.max(corner1.getX(), corner2.getX())) &&
                (getY() >= Math.min(corner1.getY(), corner2.getY()) && getY() <= Math.max(corner1.getY(), corner2.getY())) &&
                (z >= Math.min(corner1.getZ(), corner2.getZ()) && z <= Math.max(corner1.getZ(), corner2.getZ()));
    }

    public boolean isInSphere(Point3D center, double radius) {
        double distance = Math.sqrt(Math.pow(getX() - center.getX(), 2) +
                Math.pow(getY() - center.getY(), 2) +
                Math.pow(z - center.getZ(), 2));
        return distance <= radius;
    }

    public void scale(double scaleFactor) {
        super.scale(scaleFactor);
        this.z = (int)(z * scaleFactor);
    }
}
