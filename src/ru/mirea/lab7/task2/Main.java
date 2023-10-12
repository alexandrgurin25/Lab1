package ru.mirea.lab7.task2;

public class Main {
    public static void main(String[] args) {
        MovableRectangle rect = new MovableRectangle(-2, -1, 1, 1);

        System.out.println(rect);
        System.out.println("Проведем два действия: 1) Переместим вниз 2) Переместим вправо");

        rect.moveDown();
        rect.moveRight();

        System.out.println(rect);
    }
}
