package ru.mirea.taskList1.Handmade.task1;

public class LinkedList {

    private Node head;
    private int size;

    public LinkedList(){
        head = null;
        size = 0;
    }

    private class Node {
        private Student student;
        private Node next;

        public Node(Student student){
            this.student = student;
            next = null;
        }

        @Override
        public String toString() {
            return "\nNode{" +
                    "student=" + student +
                    ", next->" + next +
                    '}';
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void add(Student student){
        Node newNode = new Node(student);
        Node currentNode = head;
        if (isEmpty()){
            head = newNode;
        } else{
            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size++;
    }

    public Student remove(){
        if (isEmpty()){
            System.out.println("Не обнаружено узлов для удаления!\nСтек пуст");
            return null;
        }

        if (size == 1) {
            Student removedStudent = head.student;
            head = null;
            size--;
            return removedStudent;
        }

        Node currentNode = head;

        while (currentNode.next.next != null){
            currentNode = currentNode.next;
        }

        Student removedStudent = currentNode.next.student;
        currentNode.next = null;
        size--;
        return removedStudent;
    }

    public Student output(int n){
        if (isEmpty()){
            System.out.println("Список пуст");
            return null;
        }

        Node currentNode = head;

        if (size == 1){
            System.out.println(currentNode.student);
        }

        for (int i = 0; i < n; i++){
            currentNode = currentNode.next;
        }
        Student currentStudent = currentNode.student;
        return currentStudent;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "\nhead=" + head +
                "\n}";
    }
}
