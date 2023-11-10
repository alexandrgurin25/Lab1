package ru.mirea.HomeTaskFromLecture.Nov7;

public class LinkedList {

    private Node head;
    public int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    private class Node{
        private char bracket;
        private Node next;

        public Node(char bracket) {
            this.bracket = bracket;
            next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "bracket=" + bracket +
                    ", next=" + next +
                    '}';
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void add(char bracket){
        Node newNode = new Node(bracket);
        Node currentNode = head;
        if (isEmpty()){
            head = newNode;
        } else {
            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size++;
    }

    public Object remove(){
        if (isEmpty()){
            System.out.println("Не обнаружено узлов для удаления!\nСтек пуст");
            return null;
        }

        if (size == 1) {
            char removedBracket = head.bracket;
            head = null;
            size--;
            return removedBracket;
        }

        LinkedList.Node currentNode = head;

        while (currentNode.next.next != null){
            currentNode = currentNode.next;
        }

        char removedBracket = currentNode.next.bracket;
        currentNode.next = null;
        size--;
        return removedBracket;
    }

    public char output(int n){
        if (isEmpty()){
            System.out.println("Список пуст");
        }

        LinkedList.Node currentNode = head;

        if (size == 1){
            System.out.println(currentNode.bracket);
        }

        for (int i = 0; i < n; i++){
            currentNode = currentNode.next;
        }
        char currentCh = currentNode.bracket;
        return currentCh;
    }


}
