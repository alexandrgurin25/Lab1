package ru.mirea.lab4point1;

public class Square extends Rectangle{
    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    public double getSide(){
        return length;
    }

    public void setSide(double length){
        setLength(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
