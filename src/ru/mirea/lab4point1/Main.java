package ru.mirea.lab4point1;

public class Main {
    public static void main(String[] args) {
        System.out.println("");
        Circle circle = new Circle("Blue", true, 3.0);
        System.out.println(circle.toString());
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("Периметр: " + circle.getPerimeter());

        System.out.println("");
        Rectangle rectangle = new Rectangle("Red", true, 2.5, 4.5);
        System.out.println(rectangle.toString());
        System.out.println("Площадь: " + rectangle.getArea());
        System.out.println("Периметр: " + rectangle.getPerimeter());

        System.out.println("");
        Square square = new Square("Purple", false, 2.0, 2.0);
        System.out.println(square.toString());
        System.out.println("Сторона квадрата: "+ square.getSide());
    }
}
