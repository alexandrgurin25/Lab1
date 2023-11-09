package ru.mirea.taskList1.Handmade.task1;

import java.util.Scanner;

public class Student {
    public String name;
    public int age;
    public int height;

    public Student(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
