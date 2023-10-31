package ru.mirea.lab6.task3;

public class Tablets implements Nameable{
    String name;

    public Tablets(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println(name);
    }
}
