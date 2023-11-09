package ru.mirea.taskList1.Library.task2;

import ru.mirea.taskList1.Library.task1.Student;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Stock> stack = new Stack<>();
        Stock stock1 = new Stock("Ozon", 1, 3, 4);
        Stock stock2 = new Stock("Wildberries", 2, 1, 1);
        Stock stock3 = new Stock("Amazon", 10, 2, 1);
        stack.add(stock1);
        stack.add(stock2);
        stack.add(stock3);
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
        System.out.println(stack.get(0));
        stack.clear();
        stack.toString();
        System.out.println(stack.isEmpty());

    }
}
