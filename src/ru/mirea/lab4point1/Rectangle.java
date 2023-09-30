package ru.mirea.lab4point1;

public class Rectangle extends Shape{
    //Остановился на добавлении защищенных width и length
    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
