package ru.mirea.lab2.task3;

public class Point {
    private double x;
    private  double y;

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
