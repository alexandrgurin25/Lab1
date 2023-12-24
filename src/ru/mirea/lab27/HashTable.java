package ru.mirea.lab27;

public class HashTable {
    private static final int SIZE = 256;
    private Node[] table;

    public HashTable() {
        table = new Node[SIZE];
    }

    // Вычисление хеша
    public int hashtabHash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (31 * hash + key.charAt(i)) % SIZE;
        }
        return hash;
    }

    // Инициализация хеш-таблицы
    public void hashtabInit() {
        for (int i = 0; i < SIZE; i++) {
            table[i] = null;
        }
    }

    // Добавление элемента
    public void hashtabAdd(String key, String value) {
        int hash = hashtabHash(key);
        Node entry = new Node(key, value);
        if (table[hash] == null) {
            table[hash] = entry;
        } else {
            Node prev = null;
            Node curr = table[hash];
            while (curr != null) {
                if (curr.key.equals(key)) {
                    curr.value = value;
                    return;
                }
                prev = curr;
                curr = curr.next;
            }
            prev.next = entry;
        }
    }

    // Поиск элемента
    public String hashtabLookup(String key) {
        int hash = hashtabHash(key);
        Node curr = table[hash];
        while (curr != null) {
            if (curr.key.equals(key)) {
                return curr.value;
            }
            curr = curr.next;
        }
        return null;
    }

    class Node {
        String key;
        String value;
        Node next;

        public Node(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
}
