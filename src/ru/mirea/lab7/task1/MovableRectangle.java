package ru.mirea.lab7.task1;

import ru.mirea.lab7.task1.Movable;

public class MovableRectangle implements Movable {
    public int x;
    public int y;

    public MovableRectangle(int x, int y) {
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
    public void moveUp() {
        this.y += 1;
    }

    @Override
    public void moveDown() {
        this.y -= 1;
    }

    @Override
    public void moveLeft() {
        this.x -= 1;
    }

    @Override
    public void moveRight() {
        this.x += 1;
    }

    @Override
    public String toString() {
        return "MovableRectangle {" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
