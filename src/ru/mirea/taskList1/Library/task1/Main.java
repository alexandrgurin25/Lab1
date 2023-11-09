package ru.mirea.taskList1.Library.task1;

import java.util.Stack;
/*
    Предствлена реализация стека с помощью библиотеки java.util.Stack
 */
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Sasha",19, 184);
        Student student2 = new Student("Misha", 20, 203);
        Student student3 = new Student("Anton", 5, 190);
        Stack<Student> stack = new Stack<>();
        stack.add(student1);
        stack.add(student2);
        stack.add(student3);
        System.out.println("\nCтек после добавления студентов в список:");
        System.out.println(stack.toString());
        stack.pop();
        System.out.println("\nCтек после удаления студента:");
        System.out.println(stack.toString());
    }



}
