package ru.mirea.lab23;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue("Element 1");
        queue.enqueue("Element 2");
        queue.enqueue("Element 3");

        System.out.println("First element: " + queue.element());
        System.out.println("Queue size: " + queue.size());

        queue.dequeue();
        System.out.println("First element after one dequeue: " + queue.element());
        System.out.println("Queue size after one dequeue: " + queue.size());

        queue.clear();
        System.out.println("Queue size after clear: " + queue.size());
        System.out.println("Is queue empty: " + queue.isEmpty());
    }
}
