package ru.mirea.lab6.task3;

public class Main {
    public static void main(String[] args) {
        Tablets tablet1 = new Tablets("Sumsung");
        Tablets tablet2 = new Tablets("Apple");
        System.out.println("Первый планшет:");
        tablet1.getName();
        System.out.println("Второй планшет:");
        tablet2.getName();
    }
}
