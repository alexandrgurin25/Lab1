package ru.mirea.lab4point1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Blue", true, 3.0);
        System.out.println(circle.toString());
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("Периметр: " + circle.getPerimeter());

    }
}
