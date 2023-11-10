package ru.mirea.taskList1.Handmade.task1and2;


public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Sasha", 12, 150);
        Student student2 = new Student("Musha", 20, 203);
        Student student3 = new Student("Onten", 5, 190);
        LinkedList list = new LinkedList();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        System.out.println(list.toString());
        list.remove();
        System.out.println(list.toString());
        System.out.println(list.output(0));
    }
}
