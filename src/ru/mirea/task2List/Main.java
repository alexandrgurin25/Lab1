package ru.mirea.task2List;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        String string1 = "11";
        String string2 = "222";
        String string3 = "3333";
        list.add(string1);
        list.add(string2);
        list.add(string3);
        System.out.println(list.toString());
    }
}
