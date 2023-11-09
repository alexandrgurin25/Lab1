package ru.mirea.taskList1.Library.task1;

import java.util.Scanner;

public class Student {
    String name;
    int age;
    int height;

    public Student(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void readAttributesFromConsole(){
        Scanner scanner = new Scanner(System.in);
        this.name = scanner.nextLine();
        this.age = scanner.nextInt();
        this.height = scanner.nextInt();
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
