package ru.mirea.task2List;

/*
    Мой вариант по списку №9
9.	Элемент односвязного списка содержит ссылку на строку.
    Строки упорядочены по возрастанию.
    Вставить строку в список с сохранением упорядоченности.
    В список помещается копия входной строки в динамической памяти
 */
public class LinkedList {

    private Node head;

    private int size;

    public LinkedList(){
        head = null;
        size = 0;
    }

    public class Node{
        private String string;
        private Node next;

        public Node(String string){
            this.string = string;
            next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "string='" + string + '\'' +
                    ", next=" + next +
                    '}';
        }

    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void add(String string){
        Node newNode = new Node(string);
        Node curNode = head;

        int lenNewNode = newNode.string.length();

        //int lenCurNode = curNode.string.length();

        if (isEmpty()){
            head = newNode;
        } else if (lenNewNode < curNode.string.length()) {
            newNode.next = head;
            head = newNode;
        } else {
            while (curNode.next != null) {
                curNode = curNode.next;
            }
            curNode.next = newNode;
        }
        size++;
    }

}

